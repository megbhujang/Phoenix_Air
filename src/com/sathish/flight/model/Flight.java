package com.sathish.flight.model;

import java.io.Serializable ; 

public class Flight implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private String flightname;
    private String flightdate;
    private String flightfrom;
    private String flightto;
    private String flighttime;
    
    
	public String getName() {
		return flightname;
	}
	public void setName(String flightname) {
		this.flightname = flightname;
	}
	public String getDate() {
		return flightdate;
	}
	public void setDate(String flightdate) {
		this.flightdate = flightdate;
	}
	public String getFrom() {
		return flightfrom;
	}
	public void setFrom(String flightfrom) {
		this.flightfrom = flightfrom;
	}
	public String getTo() {
		return flightto;
	}
	public void setTo(String flightto) {
		this.flightto = flightto;
	}
	public String getTime() {
		return flighttime;
	}
	public void setTime(String flighttime) {
		this.flighttime = flighttime;
	}
	
	
	
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
    
}
