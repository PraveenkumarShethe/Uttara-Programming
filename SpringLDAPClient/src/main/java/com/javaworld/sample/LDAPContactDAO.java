package com.javaworld.sample;

import java.util.ArrayList;
import java.util.List;

import javax.naming.NamingException;
import javax.naming.directory.Attributes;
import javax.naming.directory.BasicAttribute;
import javax.naming.directory.BasicAttributes;
import javax.naming.directory.SearchControls;

import org.springframework.ldap.control.PagedResultsCookie;
import org.springframework.ldap.control.PagedResultsRequestControl;
import org.springframework.ldap.core.AttributesMapper;
import org.springframework.ldap.core.DistinguishedName;
import org.springframework.ldap.core.LdapTemplate;
import org.springframework.ldap.filter.AndFilter;
import org.springframework.ldap.filter.EqualsFilter;
import org.springframework.ldap.filter.WhitespaceWildcardsFilter;

public class LDAPContactDAO implements ContactDAO{
	private LdapTemplate ldapTemplate;
	private static final String USER_IDENTIFIER = "uid";
	private String userNamespace="ou=People";
	private String roleNamespace="ou=Roles";
	 //~ Static variables/initializers ----------------------------------------------------

    /** DOCUMENT ME! */
    private static final String DOMAIN_ROLE_PREFIX = "ngmdomain";

    /** DOCUMENT ME! */
    private static final String OBJECT_CLASS = "objectClass";
    
    private static final String mainContext="dc=lab,dc=tec";

    /** DOCUMENT ME! */
    

    /** DOCUMENT ME! */
    private static final String FIRST_NAME = "cn";

    /** DOCUMENT ME! */
    private static final String LAST_NAME = "sn";

    /** DOCUMENT ME! */
    private static final String USER_PASSWORD = "userPassword";

    /** DOCUMENT ME! */
    private static final String PREFERRED_LANGUAGE = "preferredLanguage";

    /** DOCUMENT ME! */
    private static final String UID_NUMBER = "uidNumber";

    /** DOCUMENT ME! */
    private static final String GID_NUMBER = "gidNumber";

    /** DOCUMENT ME! */
    private static final String HOME_DIRECTORY = "homeDirectory";

    /** DOCUMENT ME! */
    private static final String GROUP_DESCRIPTION = "description";

    /** DOCUMENT ME! */
    private static final String MEMBER_IDENTIFIER = "memberUid";

    /** DOCUMENT ME! */
    private static final String UNIQUE_MEMBER = "uniqueMember";

    /** DOCUMENT ME! */
    private static final String ROLE_PERMISSION = "permission";

    /** DOCUMENT ME! */
    private static final String DEFAULT_UID_NUMBER = "55";

    /** DOCUMENT ME! */
    private static final String DEFAULT_GID_NUMBER = "500";

    /** DOCUMENT ME! */
    private static final String[] USER_OBJECT_CLASSES = {
        "posixAccount", "top", "person", "inetOrgPerson"
    };

    /** DOCUMENT ME! */
    private static final String[] GROUP_OBJECT_CLASSES = {"posixGroup", "top"};


	
	public void setLdapTemplate(LdapTemplate ldapTemplate) {
		this.ldapTemplate = ldapTemplate;
	}

	public List getAllContactNames() {
		return ldapTemplate.search("", "(objectclass=person)",
				new AttributesMapper() {
					public Object mapFromAttributes(Attributes attrs)
							throws NamingException {
						return attrs.get("cn").get();
					}
				});
	}

	
	public List getContactDetails(String commonName,String lastName){
		AndFilter andFilter = new AndFilter();
		WhitespaceWildcardsFilter n=new WhitespaceWildcardsFilter("uid","");
		//WhitespaceWildcardsFilter n1=new WhitespaceWildcardsFilter("cn","");
		
		//andFilter.and(new EqualsFilter("objectclass","person"));
		//andFilter.and(new EqualsFilter("objectclass","posixAccount"));
		//andFilter.and(new EqualsFilter("objectclass","person"));
		//andFilter.and(new EqualsFilter("objectclass","inetOrgPerson"));
		andFilter.and(n);
		//andFilter.and(n1);
	   	PagedResultsRequestControl control = new PagedResultsRequestControl(20, null);
       	SearchControls searchControls = new SearchControls();
        searchControls.setSearchScope(SearchControls.SUBTREE_SCOPE);
		//andFilter.and(new EqualsFilter("sn","user"));
		System.out.println("LDAP Query " + andFilter.encode());
		return ldapTemplate.search("", andFilter.toString(),searchControls,new ContactAttributeMapper());
		
	}


    private class UserAttributeMapper implements AttributesMapper {
        @Override
        public Object mapFromAttributes(Attributes attrs) throws NamingException {
            ContactDTO contactDTO=new ContactDTO();
           // contactDTO.setCommonName(attrs.get(USER_IDENTIFIER).get().toString());//ttrs.get(USER_IDENTIFIER).get().toString());
           // contactDTO.setLastName(attrs.get(HOME_DIRECTORY).get().toString());
            
            
            
            
          //  System.out.println(attrs.get(FIRST_NAME).get().toString());

          /*  Attribute lastName = attrs.get(LAST_NAME);
            System.out.println(((lastName == null) ? ""
                : lastName.get().toString()));
            System.out.println(attrs.get(HOME_DIRECTORY).get().toString());

            Attribute language = attrs.get(PREFERRED_LANGUAGE);
            
            System.out.println(new String((byte[])attrs.get(USER_PASSWORD).get()));
*/            
            return contactDTO;
        }
    }

	
	 
	    public PagedUserCollection findAllUsersPerPage( byte[] cookieBytes){
	    	
	    	System.out.println("findAllUsersPerPage  "+cookieBytes);
	    	PagedResultsCookie cookie = (cookieBytes != null) ? new PagedResultsCookie(cookieBytes):null;
	    
	    	PagedResultsRequestControl control = new PagedResultsRequestControl(20, cookie);
	       	SearchControls searchControls = new SearchControls();
	        searchControls.setSearchScope(SearchControls.SUBTREE_SCOPE);
	       
	        //String userName="*";
	        List<ContactDTO> users = new ArrayList<ContactDTO>();
	        AndFilter andFilter = new AndFilter();
			WhitespaceWildcardsFilter n=new WhitespaceWildcardsFilter("uid","");
			WhitespaceWildcardsFilter n1=new WhitespaceWildcardsFilter("permission","ngmdomain.");
			
			andFilter.and(new EqualsFilter("objectclass","person"));
			andFilter.and(new EqualsFilter("objectclass","posixAccount"));
			andFilter.and(new EqualsFilter("objectclass","person"));
			andFilter.and(new EqualsFilter("objectclass","inetOrgPerson"));
			//andFilter.and(new EqualsFilter("permission",""));
			andFilter.and(n);
			//andFilter.and(n1);
			System.out.println("LDAP Query " + andFilter.encode());
	        users = ldapTemplate.search(roleNamespace, andFilter.encode(), searchControls,new UserAttributeMapper(),control);
			// users = ldapTemplate.search("", andFilter.encode(), searchControls,new UserAttributeMapper(),control);
	        return new PagedUserCollection(users,control.getCookie().getCookie(),20); 

	    }
	    
	    
	    private <T> List<T> getMembersFromContext(String ctx, String filter, AttributesMapper mapper) {
	        List<T> members = new ArrayList<T>();
	        WhitespaceWildcardsFilter mm=new WhitespaceWildcardsFilter(MEMBER_IDENTIFIER ,filter);
	        DistinguishedName ctxDn = new DistinguishedName(ctx);
	        System.out.println(mm.encode());
	        members.addAll(ldapTemplate.search(ctxDn,  mm.encode() + "," + mainContext + ")", mapper));
	        //members.addAll(ldapTemplate.search(ctxDn, "(" + UNIQUE_MEMBER + "=" + filter + "," + mainContext + ")", mapper));

	        return members;
	    }
	    
	    public List<ContactDTO> getRolesForUser(ContactDTO user) {
	        return getMembersFromContext(roleNamespace, getUserNamespacePath(user), new UserAttributeMapper());
	    }
	    
	    protected String getUserNamespacePath(ContactDTO user) {
	    	
	        return getNamespacePath(USER_IDENTIFIER, "", userNamespace);
	    }
	    private String getNamespacePath(String qualifier, String value, String namespace) {
	        return qualifier + "=*," + namespace;
	    }
	
	public void deleteContact(ContactDTO contactDTO) {
		DistinguishedName newContactDN = new DistinguishedName("ou=users");
		newContactDN.add("cn", contactDTO.getCommonName());
		
		ldapTemplate.unbind(newContactDN);
	}

	public void insertContact(ContactDTO contactDTO) {

		Attributes personAttributes = new BasicAttributes();
		BasicAttribute personBasicAttribute = new BasicAttribute("objectclass");
		personBasicAttribute.add("person");
		personAttributes.put(personBasicAttribute);
		personAttributes.put("cn", contactDTO.getCommonName());
		personAttributes.put("sn", contactDTO.getLastName());
		personAttributes.put("description", contactDTO.getDescription());
	
		DistinguishedName newContactDN = new DistinguishedName("ou=users");
		newContactDN.add("cn", contactDTO.getCommonName());
		
		ldapTemplate.bind(newContactDN, null, personAttributes);
	}

	public void updateContact(ContactDTO contactDTO) {
		Attributes personAttributes = new BasicAttributes();
		BasicAttribute personBasicAttribute = new BasicAttribute("objectclass");
		personBasicAttribute.add("person");
		personAttributes.put(personBasicAttribute);
		personAttributes.put("cn", contactDTO.getCommonName());
		personAttributes.put("sn", contactDTO.getLastName());
		personAttributes.put("description", contactDTO.getDescription());
	
		DistinguishedName newContactDN = new DistinguishedName("ou=users");
		newContactDN.add("cn", contactDTO.getCommonName());
		
		ldapTemplate.rebind(newContactDN, null, personAttributes);
		
		
	}
}
