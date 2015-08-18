/**
 * 
 */
package com.javaworld.sample;

import java.io.Serializable;
import java.util.Collection;

/**
 * @author Srikanth J
 * communication object for paged user list
 * important to note that cookieBytes is the byte array of the cookie
 * that needs to be used for subsequent search request
 */
public class PagedUserCollection implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Collection<ContactDTO> users;
	private byte[] cookieBytes;
	private Integer maxPageSize;
	
	public PagedUserCollection(Collection<ContactDTO> users, byte[] cookieBytes,Integer pageZise){
		this.users = users;
		this.cookieBytes = cookieBytes;
		maxPageSize=pageZise;
	}
	
	public Collection<ContactDTO> getUsers(){
		return users;
	}
	
	public byte[] getCookieBytes(){
		return cookieBytes;
	}
	
	public void setUsers(Collection<ContactDTO> users){
		this.users = users;
	}
	
	public void setCoookieBytes(byte[] cookieBytes){
		this.cookieBytes = cookieBytes;
	}

	public Integer getMaxPageSize() {
		return maxPageSize;
	}

	public void setMaxPageSize(Integer maxPageSize) {
		this.maxPageSize = maxPageSize;
	}

}
