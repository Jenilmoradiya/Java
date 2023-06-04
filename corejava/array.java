package corejava;
import java.util.Scanner;
public class array {

		public static void main(String[] args) {
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		int i,j,b;
		
		for(i=0; i<a.length; i++) {
			System.out.println("enter element");
		    a[i]=sc.nextInt();
		}
			
		for(i=0; i<a.length; i++) {
			System.out.println("elemts are" +a[i]);
		 }
		
		 for(i=0; i<a.length;i++) {
			 
			 for(j=i+1; j<a.length; j++) {
				 if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				 }
			   }
			 }
			 for(i=0;i<a.length;i++) {
			 System.out.println( +a[i]);
		 
			 
			 }
		}

	}


