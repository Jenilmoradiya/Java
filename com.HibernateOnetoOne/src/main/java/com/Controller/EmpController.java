package com.Controller;

import java.io.IOException;

import com.Bean.Emp;
import com.Bean.Empinfo;
import com.Dao.EmpDao;

import jakarta.security.auth.message.callback.PrivateKeyCallback.Request;
@jakarta.servlet.annotation.WebServlet("/EmpController")
public class EmpController extends jakarta.servlet.http.HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	protected void doPost(jakarta.servlet.http.HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response) throws jakarta.servlet.ServletException, IOException {

	 String action=request.getParameter("action");
	 
	 if(action.equalsIgnoreCase("insert")) {
		 
		 Empinfo einfo=new Empinfo();
		 
		 einfo.setFname(request.getParameter("fname"));
		 einfo.setLname(request.getParameter("lname"));
		 einfo.setEmail(request.getParameter("email"));
		 
		 EmpDao.insertintoEmpinfo(einfo);
		 
		 Emp e=new Emp();
		 
		 e.setDepartment(request.getParameter("department"));
		 e.setJob(request.getParameter("job"));
		 e.setEinfo(einfo);
		 
		 EmpDao.insertintoEmp(e);
		 response.sendRedirect("show.jsp");
	 }
	 
	 
	 else if(action.equalsIgnoreCase("Edit")) {
		 
		 int eid=Integer.parseInt(request.getParameter("eid"));
		 Emp e=EmpDao.EditData(eid);
		 request.setAttribute("e", e);
		 request.getRequestDispatcher("update.jsp").forward(request, response);
	 }
	 
	 else if(action.equalsIgnoreCase("update")) {
		 
		 
		 Empinfo einfo=new Empinfo();
		 
		 einfo.setEpid(Integer.parseInt(request.getParameter("epid")));
		 einfo.setFname(request.getParameter("fname"));
		 einfo.setLname(request.getParameter("lname"));
		 einfo.setEmail(request.getParameter("email"));
		 
	
		 
		 Emp e=new Emp();
		 e.setEid(Integer.parseInt(request.getParameter("eid")));
		 e.setDepartment(request.getParameter("department"));
		 e.setJob(request.getParameter("job"));
		 e.setEinfo(einfo);
		 
		 EmpDao.insertintoEmp(e);
		 response.sendRedirect("show.jsp");
		 
	 }
	 
	 else if(action.equalsIgnoreCase("delete")) {
		 
		 int eid=Integer.parseInt(request.getParameter("eid"));
		 EmpDao.DeleteInfo(eid);
		 response.sendRedirect("show.jsp");
	 }
	 
	}

}
