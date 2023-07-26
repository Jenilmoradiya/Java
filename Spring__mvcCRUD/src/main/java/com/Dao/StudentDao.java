package com.Dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.bean.StudenBean;


//we use transactional annotation when ever we are doing any changes in database such as insert and delete



public class StudentDao {

	private HibernateTemplate hibernateTemplate;
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	
	
	
	@Transactional
	public  void insertStudent(StudenBean s) {
		
	hibernateTemplate.saveOrUpdate(s);
	}
	
	
	public List<StudenBean> getAllStudent(){
		
		return hibernateTemplate.loadAll(StudenBean.class); 
	}
	
	
	public StudenBean GetStudent(int id) {
		
		return hibernateTemplate.get(StudenBean.class, id);
	}
	@Transactional
	public void deleteStudent(int id) {
		
		StudenBean s= hibernateTemplate.get(StudenBean.class, id);
		hibernateTemplate.delete(s);
		
	}
}
