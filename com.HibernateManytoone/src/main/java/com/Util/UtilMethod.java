package com.Util;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Bean.Dept;
import com.Bean.Emp;

public class UtilMethod {

	
	public static Session createUtil() {
		
		SessionFactory sf= new Configuration()
				.addAnnotatedClass(Dept.class)
				.addAnnotatedClass(Emp.class)
				.configure()
				.buildSessionFactory();
		Session session=sf.openSession();
		return session;
		
	}
		
		
	
	
}
