package com.sathish.registration.model;

import java.io.Serializable ; 

/**
 * JavaBean class used in jsp action tags.
 * @author Sathish
 */
public class UserRegistration implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private String name;
    private String contact;
    private String emailid;
    private String address;
    private String password;
    
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
    
}
