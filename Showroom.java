package test1;

import java.util.ArrayList;

class Showroom {
	  ArrayList<Cars> cars;
   
String sname;

public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getsname() {
	return sname;
}
public void setsname(String sname) {
	sname = sname;
}
public Showroom() {
	super();
	this.sname = sname;
}
public ArrayList<Cars> getCars() {
	return cars;
}
public void setCars(ArrayList<Cars> cars) {
	this.cars= cars;
} 
}
