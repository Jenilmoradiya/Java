package com.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Bean.Emp;
import com.Bean.Empinfo;
import com.Util.EmpUtil;

public class EmpDao {

	
	public static void insertintoEmpinfo(Empinfo e) {
		
		Session session=EmpUtil.createsession();
		Transaction tr=session.beginTransaction();
		session.saveOrUpdate(e);
		tr.commit();
		session.close();
	}
	
    public static void insertintoEmp(Emp e) {
		
		Session session=EmpUtil.createsession();
		Transaction tr=session.beginTransaction();
		session.saveOrUpdate(e);
		tr.commit();
		session.close();
	}
    
    public static List<Emp> ShowAllData(){
    	
    	Session session=EmpUtil.createsession();
    	List<Emp> list=session.createQuery("from Emp").list();
    	session.close();
    	
    	return list;
    }
    
    public static Emp EditData(int eid) {
    	
    	Session session=EmpUtil.createsession();
    	Emp e=session.get(Emp.class, eid);
    	session.close();
    	return e;
    	
    }
    
    public static void DeleteInfo(int eid){
    	
    	Session session=EmpUtil.createsession();
		Transaction tr=session.beginTransaction();
		Emp e=session.get(Emp.class, eid);
		session.delete(e);
		tr.commit();
		session.close();
    }
	
}
