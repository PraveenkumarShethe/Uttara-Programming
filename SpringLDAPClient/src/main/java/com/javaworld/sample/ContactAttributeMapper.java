package com.javaworld.sample;

import javax.naming.NamingException;
import javax.naming.directory.Attributes;

import org.springframework.ldap.core.AttributesMapper;

public class ContactAttributeMapper implements AttributesMapper{

	public Object mapFromAttributes(Attributes attributes) throws NamingException {
		ContactDTO contactDTO = new ContactDTO();
		
		System.out.println(attributes.get("homeDirectory").get().toString() +" commonName  "+attributes.get("cn").get());
		//System.out.println(attributes.get("homeDirectory").get().toString());
		/*String commonName = (String)attributes.get("cn").get();
		NamingEnumeration<? extends Attribute> atr=attributes.getAll();
		while (atr.hasMoreElements()) {
			Attribute attribute = (Attribute) atr.nextElement();
			System.out.println(attribute.size());
		}
		if(commonName != null)
			contactDTO.setCommonName(commonName);
		String lastName = (String)attributes.get("sn").get();
		if(lastName != null)
		contactDTO.setLastName(lastName);
		Attribute description = attributes.get("description");
		if(description != null)
			contactDTO.setDescription((String)description.get());*/
		return contactDTO;
	}

}
