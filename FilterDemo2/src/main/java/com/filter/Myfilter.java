package com.filter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import java.io.IOException;

public class Myfilter extends HttpFilter implements Filter {

		public void destroy() {
	     System.out.println("Filter destroy");
		}

		public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		    System.out.println("do filter");
			chain.doFilter(request, response);
	}

	
		public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("filter init");
		}
		

}
