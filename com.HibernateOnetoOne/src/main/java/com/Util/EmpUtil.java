package com.Util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Bean.Emp;
import com.Bean.Empinfo;


public class EmpUtil {


	public static Session createsession() {
		
		SessionFactory sf=new Configuration()
				.addAnnotatedClass(Empinfo.class)
				.addAnnotatedClass(Emp.class)  //will check all annoted classes which we added to emp class such as entity
				.configure()                   //will configure all the added annotations
				.buildSessionFactory();        //afterwards it will build a session for them   
			Session session=sf.openSession();   //it opes session    
		return session;
			
		
	}
	
}
