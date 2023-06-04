package corejava;

import java.util.Scanner;

public class ThrowsDemo  {

	int a;
	Scanner sc=new Scanner(System.in);
		
	void meth() throws Exception{ //throws will catch all throw of particular method
		
		System.out.print("Enter value of a :");
		a=sc.nextInt();
		
		
			if( a>0) {
	    System.out.println(" A is greater than 0 ");
}
	 else { 
		     
		 throw new Exception() ;
  }		
}
		public static void main(String[] args) {
      throwDemo d =new throwDemo();
      try {
      d.meth();
      }catch(Exception e){
    	  System.out.println("Exception caught");
      }finally {
    	 System.out.println("Finally Executed");
      }
   }
}
