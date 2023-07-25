package com.Spring.DiByConstructor;

public class Student {

	private int sid;
    private String fname,lname,email;
	
    
    
    public Student(int sid, String fname, String lname, String email) {
		super();
		this.sid = sid;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
	}




	public String toString() {
		return "Student [sid=" + sid + ", fname=" + fname + ", lname=" + lname + ", email=" + email + "]";
	}
    
	
	}
	

