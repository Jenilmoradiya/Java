package com.Spring.HelloSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainMethod {

	//Core spring has two method IOC and Di. 
	//IOC=inversion of control(Beans.xml is ioc in these project).
	//to access these ioc xml we use applicationContext.
	//Di=dependency injection(it means it will connect another class when it is required or it wont connect).
	//classPathxmlApplication=path refers to src/main/java, xml refers to beans.xml.
	//s is address of student of not an object.
	//s1 is id which we made in beans.xml and student.class is used to type cast string. 
	//we are printing object of student so we will add tostring method in student class.
	
	
	//it has two methods ORM and MVC
	//ORM=object relation mapping
	
	
	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("Beans.xml");
	    Student s=ac.getBean("s1",Student.class);  
	    System.out.println(s);  
	}	
}
