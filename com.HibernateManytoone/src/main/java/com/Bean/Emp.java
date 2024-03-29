package com.Bean;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "emp_info")
public class Emp {

	private int eid;
	private String fname,lname,email;
	Dept detp;
	
	
	@Id
	@GenericGenerator(name  ="ind" ,strategy="increment")
    @GeneratedValue(generator = "ind")
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
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
	
	
	@ManyToOne(fetch = FetchType.EAGER)
	public Dept getDetp() {
		return detp;
	}
	public void setDetp(Dept detp) {
		this.detp = detp;
	}
	
	
	
}
