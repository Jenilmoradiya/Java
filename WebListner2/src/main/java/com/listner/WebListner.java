package com.listner;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;
public class WebListner implements ServletContextListener {
	 public void contextInitialized(ServletContextEvent sce)  { 

	      System.out.println("context initialized");
	      sce.getServletContext().getAttribute("counter");
	    
	    }

	    public void contextDestroyed(ServletContextEvent sce)  { 
	    

	        System.out.println("context destroyed");
	        sce.getServletContext().getAttribute("counter");
	    }
		
	}
