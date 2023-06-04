package com.Thread;


class AA implements Runnable{
	
	   public void run() {
		   
		   System.out.println("Implementing runnable method");
	   }
}


public class Thread_runnable {

	public static void main(String[] args) {
		
		AA a=new AA();
		                             //here starat method is not present inside runnable method so we have
		Thread b=new Thread(a);      //to make thread object to use start method and access run method
        b.start();
	}
}
