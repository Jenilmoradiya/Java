package corejava;

import java.util.Scanner;
 
public class throwDemo {

	int a;
	Scanner sc=new Scanner(System.in);
		
	void meth() {
		
		System.out.print("Enter value of a");
		a=sc.nextInt();
		
		try {
			if( a>0) {
	    System.out.println(" A is greater than 0 ");
}
	 else { 
		     
		 throw new Exception() ;
   }
		} catch(Exception e) {
		
		 System.out.println("exception caught");
   }
}
		public static void main(String[] args) {
      throwDemo d =new throwDemo();
      d.meth();

	}

}
