package com.Dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Bean.Dept;
import com.Bean.Emp;
import com.Util.UtilMethod;

public class EmpDao {

	public static void insertDept(Dept d) {
		
		Session session =UtilMethod.createUtil();
		Transaction tr=session.beginTransaction();
		session.save(d);
		tr.commit();
		session.close();
	}
	
	
    public static void insertEmp(Emp e) {
		
		Session session =UtilMethod.createUtil();
		Transaction tr=session.beginTransaction();
		session.save(e);
		tr.commit();
		session.close();
	}
    
    
    public static Dept ShowDept(int did) {
		
		Session session =UtilMethod.createUtil();
		Dept d=session.get(Dept.class, did);
		session.close();
		return d;
	}
}
