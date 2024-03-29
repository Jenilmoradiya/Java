package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.client.ClientConfig;

import com.bean.Student;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

@WebServlet("/StudentController")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	String WebURL="http://localhost:8080/RestServer/";
	ClientConfig clientConfig=null;
	Client client=null;
	Gson json=new Gson();
	WebTarget target=null;
	
	protected void showData(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Response rs=target.path("student").path("getall").request().get();
		String result=rs.readEntity(String.class);
		
		if(rs.getStatus()==200)
		{
			List<Student> list=json.fromJson(result, new TypeToken<List<Student>>(){}.getType());
			request.setAttribute("list", list);
			request.getRequestDispatcher("show.jsp").forward(request, response);
		}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		clientConfig=new ClientConfig();
		client=ClientBuilder.newClient(clientConfig);
		target=client.target(WebURL).path("rest");
		String action=request.getParameter("action");
		
		if(action.equalsIgnoreCase("insert"))
		{
			Student s=new Student();
			s.setFname(request.getParameter("fname"));
			s.setLname(request.getParameter("lname"));
			s.setEmail(request.getParameter("email"));
			String student=json.toJson(s);
			
			Response rs=target.path("student").path("insert").request().post(Entity.json(student));
			String result=rs.readEntity(String.class);
			System.out.println(result);
			showData(request, response);
		}
	}
}
