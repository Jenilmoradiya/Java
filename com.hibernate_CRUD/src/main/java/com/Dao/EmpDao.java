package com.Dao;

import java.util.List;

import org.hibernate.Session;

import com.Bean.EmpBean;
import com.Util.EmpUtil;

public class EmpDao {

	
	public static void insertmethod(EmpBean e) {
		
		Session session=EmpUtil.createsession();
		org.hibernate.Transaction tr=session.beginTransaction();
		session.save(e);
		tr.commit();
		session.close();
	}
	

	public static List<EmpBean> getshowMethod(){

		Session session=EmpUtil.createsession();
		List<EmpBean> list=session.createQuery("from EmpBean").list();
		session.close();
		return list;
		
	}
	
	
	public static EmpBean getEditmethod(int eid){

		Session session=EmpUtil.createsession();
		EmpBean e=session.get(EmpBean.class, eid);
		session.close();
		return e;
		
	}
	
    public static void Updatemethod(EmpBean e) {
		
		Session session=EmpUtil.createsession();
		org.hibernate.Transaction tr=session.beginTransaction();
		session.saveOrUpdate(e);;
		tr.commit();
		session.close();
	}
	
    public static void DeleteMethod(int eid) {
    	
    	Session session=EmpUtil.createsession();
    	org.hibernate.Transaction tr=session.beginTransaction();
		EmpBean e=session.get(EmpBean.class, eid);
    	session.delete(e);
    	tr.commit();
    	session.close();
    	
    }
  

}
