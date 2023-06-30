package com.Controller;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.Dao.StudentDao;
import com.bean.*;
@WebServlet("/StudentController")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		   String action=  request.getParameter("action");
		     
		     if(action.equalsIgnoreCase("insert")) {
		    	 
		    	 Student s=new Student();
		    	 
		    	 s.setFname(request.getParameter("fname"));
		    	 s.setLname(request.getParameter("lname"));
		    	 s.setGender(request.getParameter("gender"));
		    	 s.setEmail(request.getParameter("email"));
		    	 s.setMobile(request.getParameter("mobile"));
		    	 s.setAddress(request.getParameter("address"));
		    	 
		    	StudentDao.insertStudent(s);
		    	
		    	 response.sendRedirect("show.jsp"); 	 
		    	 //request.setAttribute("msg", "Data Inserted Successfully");
		    	 //request.getRequestDispatcher("index.jsp").forward(request, response);
		     }
		     
		     else if(action.equalsIgnoreCase("edit")) {
          
		  int id=Integer.parseInt(request.getParameter("id"));
		  Student s=StudentDao.GetStudent(id);
		  request.setAttribute("s", s);
		  request.getRequestDispatcher("update.jsp").forward(request, response);
		    	 
		}
		     else if(action.equalsIgnoreCase("update")) {
		    	 
		    	 
		    	 Student s=new Student();
		    	 s.setId(Integer.parseInt(request.getParameter("id")));
		    	 s.setFname(request.getParameter("fname"));
		    	 s.setLname(request.getParameter("lname"));
		    	 s.setGender(request.getParameter("gender"));
		    	 s.setEmail(request.getParameter("email"));
		    	 s.setMobile(request.getParameter("mobile"));
		    	 s.setAddress(request.getParameter("address"));
		    	 
		    	StudentDao.updateStudent(s);
		    	
		    	 response.sendRedirect("show.jsp");
		     }
               else if(action.equalsIgnoreCase("delete")) {
		    	 
		    	 
		    	 Student s=new Student();
		    	 int id=Integer.parseInt(request.getParameter("id"));
		    	 
		    	StudentDao.deleteStudent(id);
		    	
		    	 response.sendRedirect("show.jsp");
		     }
	}	
	}


