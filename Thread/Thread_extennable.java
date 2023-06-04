package com.Thread;


class A extends Thread{
	
	public void run() {                                //run method is present inside THread class
  
		 System.out.println("Thread by extending class");
		 
	}
}
public class Thread_extennable {

	public static void main(String[] args) {
	 
	  A a=new A();
	  a.start();               //start function is used to invoke run method
	  
	
 }
}
