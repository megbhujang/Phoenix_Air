package com.sathish.enquiry.model;

import java.io.Serializable  ; 

/**
 * JavaBean class used in jsp action tags.
 * @author Sathish
 */
public class Enquiry implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private String edate;
    private String etitle;
    private String etype;
    private String edesc;
    private String agent_email;
    private String user_email;
    
    
	public String getEdate() {
		return edate;
	}
	public void setEdate(String edate) {
		this.edate = edate;
	}
	public String getEtitle() {
		return etitle;
	}
	public void setEtitle(String etitle) {
		this.etitle = etitle;
	}
	public String getEtype() {
		return etype;
	}
	public void setEtype(String etype) {
		this.etype = etype;
	}
	public String getEdesc() {
		return edesc;
	}
	public void setEdesc(String edesc) {
		this.edesc = edesc;
	}
	public String getAgentemail() {
		return agent_email;
	}
	public void setAgentemail(String agent_email) {
		this.agent_email = agent_email;
	}
	public String getUseremail() {
		return user_email;
	}
	public void setUseremail(String user_email) {
		this.user_email = user_email;
	}
	
	
	
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
    
}
