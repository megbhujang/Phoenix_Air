package com.sathish.booking.model;

import java.io.Serializable ; 

public class Booking implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private String bookingname;
    private String bookingtype;
    private String bookingclass;
    
    
	public String getName() {
		return bookingname;
	}
	public void setName(String bookingname) {
		this.bookingname = bookingname;
	}
	public String getType() {
		return bookingtype;
	}
	public void setType(String bookingtype) {
		this.bookingtype = bookingtype;
	}
	public String getBClass() {
		return bookingclass;
	}
	public void setBClass(String bookingclass) {
		this.bookingclass = bookingclass;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
    
}
