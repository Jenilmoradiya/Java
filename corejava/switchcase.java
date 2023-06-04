package corejava;

import java.util.Scanner;

public class switchcase {

	
		public static void main(String[] args) {

		 
			// TODO Auto-generated method stub
			
				int a,b,c;
		       Scanner sc=new Scanner(System.in);
		       System.out.println("enter value of a");
		       a=sc.nextInt();
		       System.out.println("enter value of b");
		       b=sc.nextInt();
		       
		       System.out.println("Addition");
		       System.out.println("multiplication");
		       System.out.println("division");
		      
		        System.out.println("enter value of c");
		        c=sc.nextInt();
				
		        switch(c)
		        {
		        case 1:
		        	c=a+b;
		        	System.out.println("addition" +c );
		        	break;
		        case 2:
		        	c=a*b;
		        	System.out.println("multiplication" +c);
		        	break;
		        case 3:
		        	c=a/b;
		        	System.out.println("Division" +c );
		        	break;
		        
			}

		 }

		}




