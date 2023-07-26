package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Dao.StudentDao;
import com.bean.StudenBean;




@Controller
public class MyController {

	ApplicationContext ac=new ClassPathXmlApplicationContext("Beans.xml");
	StudentDao studentDao=ac.getBean("studentDao",StudentDao.class );
		
	
	@RequestMapping(value="/",method = RequestMethod.GET)
	public String home() {
		
		return "insert";
	}
	@RequestMapping(value="insert", method = RequestMethod.POST )
	public String insert(HttpServletRequest request, HttpServletResponse response) {
	
		StudenBean s=new StudenBean();
		
		s.setFname(request.getParameter("fname"));
		s.setLname(request.getParameter("lname"));
		s.setEmail(request.getParameter("email"));
		s.setGender(request.getParameter("gender"));
		s.setAddress(request.getParameter("address"));
		s.setMobile(request.getParameter("mobile"));
	    studentDao.insertStudent(s);
	    
	    return "show";
	    }
	@RequestMapping(value = "edit",method=RequestMethod.POST)
	public String edit(HttpServletRequest request,HttpServletResponse response)
	{
		int id=Integer.parseInt(request.getParameter("id"));
		StudenBean s=studentDao.GetStudent(id);
		studentDao.insertStudent(s);
		request.setAttribute("s", s);
		return "update";
	}
	@RequestMapping(value = "delete",method=RequestMethod.POST)
	public String delete(HttpServletRequest request,HttpServletResponse response)
	{
		int id=Integer.parseInt(request.getParameter("id"));
		studentDao.deleteStudent(id);
		return "show";
	}
	@RequestMapping(value = "update",method=RequestMethod.POST)
	public String update(HttpServletRequest request,HttpServletResponse response)
	{
		StudenBean s=new StudenBean();
		s.setId(Integer.parseInt(request.getParameter("id")));
		s.setFname(request.getParameter("fname"));
		s.setLname(request.getParameter("lname"));
		s.setEmail(request.getParameter("email"));
		s.setGender(request.getParameter("gender"));
		s.setAddress(request.getParameter("address"));
		s.setMobile(request.getParameter("mobile"));
		studentDao.insertStudent(s);
		return "show";
	}
	
}
