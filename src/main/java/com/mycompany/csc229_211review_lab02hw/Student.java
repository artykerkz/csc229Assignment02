package com.mycompany.csc229_211review_lab02hw;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Person {
	private String address;
	private double gpa;
	
	

public Student(String name, int age) {
	super(name, (short) age);
	this.address = "";
	this.gpa = 0.0;
}



public Student(String name, short age, String address) {
	super(name, age);
	this.address = address; 
	this.gpa = 0.0;
}


@Override 
public String getAddress() {
	return address;
}


@Override
public void setAddress(String address) {
	this.address = (address == null) ? "" : address.trim();
}

public void setGpa(double gpa) {
	if (gpa < 0.0 || gpa > 4.0) {
		throw new IllegalArgumentException("GPA must be between 0.0 4.0");
	}
	this.gpa = gpa;
}


@Override 
public String toString() {
	return "Student{name='" + getName()
		+"', age=" + getAge()
		+", address='" + getAddress()
		+"', gpa=" + String.format("%.2g", gpa) + "}";
}
	

}
