package com.Thread;

class movie extends Thread{
	
	int total=0;
       public void run() {
    	   synchronized(this) {
    	   for(int i=0;i<=3;i++) {
    		   
    		   total=total+100;
    	    }
    	   this.notify();
    	   }
    	
       }
	   
}

public class Thread_Intercommunication  {

	public static void main(String[] args)throws Exception {
		movie v=new movie();
        v.start();
        
        synchronized(v) {
        	v.wait();
   	   System.out.println(v.total);
	}
	}

}
