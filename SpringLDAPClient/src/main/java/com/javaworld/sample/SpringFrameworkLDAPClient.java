package com.javaworld.sample;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.dao.DataAccessException;

public class SpringFrameworkLDAPClient {

	public static void main(String[] args) {
		try {
			Resource resource = new ClassPathResource("springldap.xml");
			BeanFactory factory = new XmlBeanFactory(resource);
			ContactDAO ldapContact = (LDAPContactDAO)factory.getBean("ldapContact");
			List contactList = ldapContact.getContactDetails("aa","aa");
			System.out.println("DDDDDDDDd   "+contactList.size());
			/**
			for( int i = 0 ; i < contactList.size(); i++){
				System.out.println("Contact Name " + contactList.get(i));
			}*/
			/*byte[] cookie=null;
			for(int i=0;i<1;i++)
			{
			
			 
			 PagedUserCollection pagedUserCollection=ldapContact.findAllUsersPerPage(cookie);
			// cookie=pagedUserCollection.getCookieBytes();
			 System.out.println("cookie   "  +cookie);
			 System.out.println(" Value Of I   "+i +"  Size of Users  "+pagedUserCollection.getUsers().size());
			 for(ContactDTO ct:pagedUserCollection.getUsers())
			 {
				 System.err.println(ct.getCommonName()     +"   "+ ct.getLastName());
			 }
			
			}*/
			ContactDTO newContactDTO = new ContactDTO();
			
		//	System.out.println("     "+ldapContact.getRolesForUser(newContactDTO).size());
			
			newContactDTO.setCommonName("Rahul");
			newContactDTO.setLastName("Dravid");
			newContactDTO.setDescription("Former Indian opening batsman");
			//ldapContact.updateContact(newContactDTO);
		} catch (DataAccessException e) {
			System.out.println("Error occured " + e.getCause());
		}
	}
}
