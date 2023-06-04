package com.Thread;

class Priority_1 extends Thread{
	
	public void run() {
		
		System.out.println(Thread.currentThread().getName());               //to get thread name
		System.out.println(Thread.currentThread().getPriority());           //to get thread priority
	}
}


public class Thread_priority {

	public static void main(String[] args) {
                  
		Priority_1 p1=new Priority_1();
		Priority_1 p2=new Priority_1();	
		 
		p1.setName("Thread 1");
		p2.setName("Thread 2");
		
		p1.setPriority(9);
		p2.setPriority(2);
		
		p2.start();
		p1.start();
		
	}

}
