package com.SpringLifecycle.SpringInnerBean;

public class Person {

	private String fname;
	Phone phone;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public Phone getPhone() {
		return phone;
	}
	public void setPhone(Phone phone) {
		this.phone = phone;
	}
	
	public void PersonMethod() {
		
		System.out.println("calling....." +fname);
		phone.phoneMethod();
		
	}
}
