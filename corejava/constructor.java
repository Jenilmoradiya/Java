package corejava;

import java.nio.file.spi.FileSystemProvider;

	class Table{
		int no1,no2;
		Table(){
			System.out.println("default constructor");
			no1=4;
			no2=6;
		}
		
		Table(int a, int b){
	       System.out.println("these is parameterize constructor");		
			no1=a;
			no2=b;
		}
		 Table(Table T)
		 { System.out.println("copy constructor");
			 no1= T.no1;
		   no2=T.no2;
	     }
		
		//function
		void volume() {
			
			System.out.println("Aera is =" +(no1*no2));
		}
		
	}

	public class constructor {

		public static void main(String[] args) {
			Table t1=new Table();
			t1.volume();
			Table t2=new Table(9,8);
			t2.volume();
	        Table t3=new Table(t1);
	        t3.volume();
	        
		}

	}


