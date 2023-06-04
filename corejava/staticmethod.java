package corejava;

public class staticmethod {

	static int a=18;
	static int b;
	 static int c;
	 
		
		{
			System.out.println("1st");
		}
		
	static void put(int b) {
		System.out.println("your age ="+a );
		
		System.out.println("your number =" +b);
	
		System.out.println("aadhar number =" +c);
	}
	

	 public staticmethod(){
		System.out.println("constructor is called");
	}
	 
	static{
		System.out.println("It is static block");
		c=a+1;
	}
	
	{
		System.out.println("2nd");
	  }
	
	public static void main(String[] args) {
			put(12);
			staticmethod s1=new staticmethod();
	
	}

}
