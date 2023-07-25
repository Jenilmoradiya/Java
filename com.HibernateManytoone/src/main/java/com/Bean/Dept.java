package com.Bean;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.GenericGenerator;

import jakarta.annotation.Generated;

@Entity
@Table(name = "dept_info")
public class Dept {

 private int did;
 private String job,loc;
 Collection<Emp> emp;
 
 
 @Id
 @GenericGenerator(name  ="ind" ,strategy="increment")
 @GeneratedValue(generator = "ind")
public int getDid(){
	return did;
}
public void setDid(int did){
	this.did = did;
}

public String getJob() {
	return job;
}
public void setJob(String job) {
	this.job = job;
}


public String getLoc() {
	return loc;
}
public void setLoc(String loc) {
	this.loc = loc;
}


@OneToMany(fetch = FetchType.LAZY ,mappedBy = "dept")
public Collection<Emp> getEmp() {
	return emp;
}
public void setEmp(Collection<Emp> emp) {
	this.emp = emp;
  }	
}
