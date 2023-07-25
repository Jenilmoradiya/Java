package com.SpringLifecycle.SpringInheritance;

public class Manager {

	private String fname,lname,email;

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void init() {
		System.out.println("Cycle initialised");
	}
     
    public void destroy() {
    	
    	System.out.println("cycle destroyed");
    }

	
	public String toString() {
		return "Manager [fname=" + fname + ", lname=" + lname + ", email=" + email + "]";
	}
    
    
}
