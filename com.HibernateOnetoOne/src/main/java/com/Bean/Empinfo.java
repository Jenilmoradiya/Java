package com.Bean;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import jakarta.annotation.Generated;

@Entity
@Table(name = "EMPINFO")
public class Empinfo {

	private int epid;
	private String fname,lname,email;
	private Emp emp;                 //object of emp table is made which is child table and in emp table empinfo table object will be made.
	
	
	
	@Id
	@GenericGenerator(name="inc",strategy = "increment")
	@GeneratedValue(generator ="inc")
	public int getEpid() {
		return epid;
	}
	public void setEpid(int epid) {
		this.epid = epid;
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
	
	                                                                                  //fetch=fetchtypelazy means it will only fetch data of empinfo when you call empinfo class.
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy ="einfo")      //cascade=cascadetypeall refers to whenever change is made in one table it will automatically change in orther table.
	public Emp getEmp() {                                                         //mappedby=enifo is the object of emp class object to connect both table.
		return emp;
	}
	public void setEmp(Emp emp) {
		this.emp = emp;
	}
	
	
}
