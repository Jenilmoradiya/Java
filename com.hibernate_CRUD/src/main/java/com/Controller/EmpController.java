package com.Controller;

import java.io.IOException;


import com.Bean.EmpBean;
import com.Dao.EmpDao;
public class EmpController extends jakarta.servlet.http.HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(jakarta.servlet.http.HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response) throws jakarta.servlet.ServletException, IOException {

		
	     String action=request.getParameter("action");
        
        if(action.equalsIgnoreCase("insert")) {
        	
        	EmpBean s=new EmpBean();
        	s.setFname(request.getParameter("fname"));
        	s.setLname(request.getParameter("lname"));
        	s.setAddress(request.getParameter("address"));
        	s.setMobile(request.getParameter("mobile"));
        	s.setGender(request.getParameter("gender"));
        	s.setEmail(request.getParameter("email"));
           EmpDao.insertmethod(s);
           response.sendRedirect("show.jsp");
        
        } 
        
        else if(action.equalsIgnoreCase("edit")) {
    		
       	 int eid=Integer.parseInt(request.getParameter("eid"));
       	 EmpBean s=EmpDao.getEditmethod(eid);
       	 request.setAttribute("s", s);
    		 request.getRequestDispatcher("update.jsp").forward(request, response);
    	}
        
        
        else if(action.equalsIgnoreCase("update")) {
       	 
       	 
       		
         	EmpBean s=new EmpBean();
            s.setEid(Integer.parseInt(request.getParameter("eid")));
         	s.setFname(request.getParameter("fname"));
         	s.setLname(request.getParameter("lname"));
         	s.setAddress(request.getParameter("address"));
         	s.setMobile(request.getParameter("mobile"));
         	s.setGender(request.getParameter("gender"));
         	s.setEmail(request.getParameter("email"));
            EmpDao.Updatemethod(s);
            response.sendRedirect("show.jsp");
       			 
       		 }
        else if(action.equalsIgnoreCase("delete")) {
        	
        	
        	 int eid=Integer.parseInt(request.getParameter("eid"));
        	 EmpDao.DeleteMethod(eid);
        	  response.sendRedirect("show.jsp");
        }
        
	}
	
	

}
