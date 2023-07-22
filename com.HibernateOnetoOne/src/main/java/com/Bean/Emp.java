package com.Bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name ="EMPP")
public class Emp {

	private int eid;
	private String department,job;
	private Empinfo einfo;
	
	@Id
	@GenericGenerator(name="inc",strategy = "increment")
	@GeneratedValue(generator ="inc")
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	@OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)   //fetch type eager means  whenever you call emp class empinfo info class will also be called so both info will be showed
	public Empinfo getEinfo() {
		return einfo;
	}
	public void setEinfo(Empinfo einfo) {
		this.einfo = einfo;
	}
	
	
	
}
