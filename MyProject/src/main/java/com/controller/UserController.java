package com.controller;

import jakarta.security.auth.message.callback.PrivateKeyCallback.Request;
import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.List;
import java.util.Random;

import javax.swing.Action;

import com.bean.CartBean;
import com.bean.UserBean;
import com.bean.wishlistBean;
import com.dao.CartDao;
import com.dao.UserDao;
import com.dao.WishlistDao;
import com.service.Services;
@WebServlet("/UserController")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	String action=request.getParameter("action");
	
	if(action.equalsIgnoreCase("Sign Up")) {
		
		Boolean flagBoolean=UserDao.CheckEmail(request.getParameter("email"));
		
		if(flagBoolean ==false) {
			
			if(request.getParameter("password").equals(request.getParameter("cpassword"))) {
			
		UserBean u=new UserBean();
		
		u.setFname(request.getParameter("fname"));
		u.setLname(request.getParameter("lname"));
		u.setEmail(request.getParameter("email"));
		u.setMobile(request.getParameter("mobile"));
		u.setAddress(request.getParameter("address"));
		u.setPassword(request.getParameter("password"));
		u.setUsertype(request.getParameter("usertype"));
		
	     UserDao.SignUp(u);
	     response.sendRedirect("login.jsp");
	}
			else {

				request.setAttribute("msg", "Password and Confirm Password doesnt match");
				request.getRequestDispatcher("signup.jsp").forward(request, response);
			}
      }
		else {
			
			request.setAttribute("msg", "Email already Registerd");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	
	}
	else if(action.equalsIgnoreCase("login")) {
		
		UserBean u=UserDao.UserLogin(request.getParameter("email"));
		
		if(u!=null) {
			
			if(u.getPassword().equals(request.getParameter("password"))) {
				
				if(u.getUsertype().equals("buyer")) {
					
					
				HttpSession session=request.getSession();
				session.setAttribute("u", u);
				List<wishlistBean> list=WishlistDao.DisplaytoWishlist(u.getUid());
				session.setAttribute("wishlist_count", list.size());
				List<CartBean> list1=CartDao.FetchdetailsForCart(u.getUid());
				session.setAttribute("cart_count", list1.size());
				request.getRequestDispatcher("index.jsp").forward(request, response);
				}
				else {
					HttpSession session=request.getSession();
					session.setAttribute("u", u);
					request.getRequestDispatcher("seller-index.jsp").forward(request, response);
					
				}
			}
			else {
				
				request.setAttribute("msg", "Incorrect Password");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
		}
		else {
			
			request.setAttribute("msg", "Email not registered");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}

	}
	   else if(action.equalsIgnoreCase("change password")){
		 
		  HttpSession session=request.getSession();
		  UserBean u=(UserBean) session.getAttribute("u");
           if(u.getPassword().equals(request.getParameter("oldpassword"))) {
        	   
        	   
        	   if(request.getParameter("newpassword").equals(request.getParameter("cnewpassword"))) 
        	   
        	   {
        		   
        		   if(!request.getParameter("oldpassword").equals(request.getParameter("newpassword"))) 
        		   
        		   {
        			   
        			   UserDao.ChangePassword1 (u.getEmail() ,request.getParameter("newpassword") );
        			   response.sendRedirect("logout.jsp");
        		   }
        		   else
        		   { 
        			   if(u.getUsertype().equals("buyer"))
        			{
        			   request.setAttribute("msg", "New and old password cannot be same.");
        			   request.getRequestDispatcher("changePassword.jsp").forward(request, response);
        		   }
        			   else {
        				   request.setAttribute("msg", "New and old password cannot be same.");
            			   request.getRequestDispatcher("seller-changePassword.jsp").forward(request, response);
        				   
        			   }
        		   }
        	   }
        		   
        		   else 
            	   {   
            		   if(u.getUsertype().equals("buyer"))
            	   {
        			   request.setAttribute("msg", "New password and confirm new password doent match.");
        			   request.getRequestDispatcher("changePassword.jsp").forward(request, response);
        		   }
            
            	   
            	   
            	   else {
            		   request.setAttribute("msg", "New password and confirm new password doent match.");
        			   request.getRequestDispatcher("seller-changePassword.jsp").forward(request, response);
            	     }   
            	   }
           }   
        	 
           
           else
           {  
        	   if(u.getUsertype().equals("buyer"))
           {
			   request.setAttribute("msg", "Old password is Incorrect.");
			   request.getRequestDispatcher("changePassword.jsp").forward(request, response);
		   }
        	   else {
        		   request.setAttribute("msg",  "Old password is Incorrect.");
    			   request.getRequestDispatcher("seller-changePassword.jsp").forward(request, response);
				   
        	   }
           }
        }
	
	   else if(action.equalsIgnoreCase("Send OTP"))
	   {
		   boolean flag =UserDao.CheckEmail(request.getParameter("email"));
		   
		   if(flag==true)
		   {
			   

				Random t = new Random();
		    	int minRange = 1000, maxRange= 9999;
	        	int otp = t.nextInt(maxRange - minRange) + minRange;
	        	Services.sendMail(request.getParameter("email"), otp);
	        	request.setAttribute("email", request.getParameter("email"));
	        	request.setAttribute("otp", otp);
	        	request.getRequestDispatcher("otp.jsp").forward(request, response);
		   }		   
		   else {
			   
			   request.setAttribute("msg", "Email not registered");
			   request.getRequestDispatcher("forgotPassword.jsp").forward(request, response);
		   }
	   }
	
	   else if(action.equalsIgnoreCase("Verify otp"))
	   {
		   int otp=Integer.parseInt(request.getParameter("otp"));
		   int uotp=Integer.parseInt(request.getParameter("uotp"));
		   String email=request.getParameter("email");
		   
		   if(otp==uotp)
		   {
			   request.setAttribute("email", email);
			   request.getRequestDispatcher("newPassword.jsp").forward(request, response);
			   
		   }		   
		   else {
			   request.setAttribute("msg", "Invalid OTP");
			   request.setAttribute("email", email);
			   request.setAttribute("otp", otp);
			   request.getRequestDispatcher("otp.jsp").forward(request, response);
		   }
	   }
	
	   else if(action.equalsIgnoreCase("Update Password")) {
		   
		   String np=request.getParameter("newpassword");
		   String cnp=request.getParameter("cnewpassword");
		   String email=request.getParameter("email");
		   
		   if(np.equals(cnp)) {
			   
			   UserDao.ChangePassword1(email, cnp);
			   request.setAttribute("msg", "Password Updated Successfully");
			   request.getRequestDispatcher("login.jsp").forward(request, response);
		   }
		   
		   else {
			   request.setAttribute("msg", "Password doesnt match");
			   request.getRequestDispatcher("newPassword.jsp").forward(request, response);
		   }
	   }
	
	}
	
 }


