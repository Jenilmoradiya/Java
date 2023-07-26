package com.Controller;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Dao.StudentDao;
import com.bean.StudenBean;

import jakarta.security.auth.message.callback.PrivateKeyCallback.Request;

@jakarta.servlet.annotation.WebServlet("/StudentController")
public class StudentController extends jakarta.servlet.http.HttpServlet {
	private static final long serialVersionUID = 1L;

	//Here as we see the static method was not made in dao method because it will fetch data as below
	//Applictioncontext method is made and beans. xml file is fetched
	//here the studentdao present inside getbean is the id which we have mentioned in beans.xml file
	//Here the studenDao obj sd is use to call method from dao.
	
	
	protected void doPost(jakarta.servlet.http.HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response) throws jakarta.servlet.ServletException, IOException {
		
		String action=request.getParameter("action");
        ApplicationContext ac=new ClassPathXmlApplicationContext("Beans.xml");
		StudentDao sd=ac.getBean("studentDao",StudentDao.class );
			
		if(action.equalsIgnoreCase("insert")) {
			
			StudenBean s=new StudenBean();
			
			s.setFname(request.getParameter("fname"));
			s.setLname(request.getParameter("lname"));
			s.setEmail(request.getParameter("email"));
			s.setGender(request.getParameter("gender"));
			s.setAddress(request.getParameter("address"));
			s.setMobile(request.getParameter("mobile"));
		    sd.insertStudent(s);
		    response.sendRedirect("show.jsp");
		
		}
	
		else if(action.equalsIgnoreCase("edit")) {
			
			int id=Integer.parseInt(request.getParameter("id"));
			StudenBean s=sd.GetAllStudent(id);
			request.setAttribute("s", s);
		    request.getRequestDispatcher("update.jsp").forward(request, response);
		}
		
		else if(action.equalsIgnoreCase("update")) {
			
			StudenBean s=new StudenBean();
			s.setId(Integer.parseInt(request.getParameter("id")));
			s.setFname(request.getParameter("fname"));
			s.setLname(request.getParameter("lname"));
			s.setEmail(request.getParameter("email"));
			s.setGender(request.getParameter("gender"));
			s.setAddress(request.getParameter("address"));
			s.setMobile(request.getParameter("mobile"));
	        sd.insertStudent(s);
	        response.sendRedirect("show.jsp");
		}
		
		else if(action.equalsIgnoreCase("delete")) {
			
			int id=Integer.parseInt(request.getParameter("id"));
			sd.deleteStudent(id);
			response.sendRedirect("show.jsp");
		}
	}

}
