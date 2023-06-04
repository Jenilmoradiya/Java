package com.Thread;


class Synchro{
	
	public synchronized void table(int x) {
		
		for(int n=1; n<=10;n++) {
			
		System.out.println(n*x);
		
		}
	}	
}

class Ext extends Thread{                                   
	Synchro s;                            //Synchro s is used to make reference of class Synchro because 
	Ext(Synchro s){                       // class ext is not extendind class sunchro so we make reference 
		this.s=s;
	}
	 public  void run() {
	  s.table(3);
	 }
}
class Ext1 extends Thread{
	Synchro s;
	Ext1(Synchro s){
		this.s=s;
	}
	 public  void run() {
	  s.table(5);
	 }
}

public class Thread_Synchronize_method  {

	public static void main(String[] args) {
		Synchro obj=new Synchro();
        
		Ext t=new Ext(obj);
		Ext1 t1=new Ext1(obj);
	     t.start();
	     t1.start();
 }
}
