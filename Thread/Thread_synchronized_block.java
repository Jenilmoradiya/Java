package com.Thread;


 class meth{
	 
	public void method(String name) {
		
		  synchronized(this){
			  
			  System.out.println(name);
		  }
	}
 }
 
 class meth1 extends Thread{
	 meth m;
	 String name;
	 meth1(meth m,String name){
		 this.m=m;
		 this.name=name;
	}
	 public void run() {
	 m.method(name);
 }
 }
public class Thread_synchronized_block {

	public static void main(String[] args) {
		meth m=new meth();
		meth1 a=new meth1(m,"Jenil"); 
		a.start();
	}

}