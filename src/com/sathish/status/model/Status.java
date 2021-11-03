package com.sathish.status.model;

import java.io.Serializable;

public class Status implements Serializable {
	  private String flightname;
	  private String flightfrom;
	  private String flightto;
	  private String flighttime;
	  private String flightdate;
 
  public Status() {
// TODO Auto-generated constructor stub
}
 


public Status(String flightdate) {
super();
this.flightdate = flightdate;
}



public Status(String flightname, String flightfrom, String flightto,
String flighttime) {
	super();
this.flightname = flightname;
this.flightfrom = flightfrom;
this.flightto = flightto;
this.flighttime = flighttime;
}



public String getName() {
return flightname;
}
public void setName(String flightname) {
this.flightname = flightname;
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
public String getDate() {
return flightdate;
}
public void setDate(String flightdate) {
this.flightdate = flightdate;
}


}


