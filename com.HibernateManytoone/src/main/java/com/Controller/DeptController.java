package com.Controller;

import java.io.IOException;

import com.Bean.Dept;
import com.Bean.Emp;
import com.Dao.EmpDao;

@jakarta.servlet.annotation.WebServlet("/DeptController")
public class DeptController extends jakarta.servlet.http.HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(jakarta.servlet.http.HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response) throws jakarta.servlet.ServletException, IOException {
	
	       String action=request.getParameter("action");
	       
	       if(action.equalsIgnoreCase("insert dept")) {
	    	   
	    	   Dept d=new Dept();
	    	   d.setJob(request.getParameter("job"));
	    	   d.setLoc(request.getParameter("loc"));
	    	   
	       }
	       
	       else if(action.equalsIgnoreCase("insert emp")) {
	    	   
	    	   Emp e=new Emp();
	    	  e.setFname(request.getParameter("fname"));
	    	  e.setLname(request.getParameter("lname"));
	    	  e.setEmail(request.getParameter("email"));
	    	  int did=Integer.parseInt(request.getParameter("did"));
	    	  Dept d=EmpDao.ShowDept(did);
	    	  e.setDetp(d);
	    	  
	       }
		
	}

}
