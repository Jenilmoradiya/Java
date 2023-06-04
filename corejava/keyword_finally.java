package corejava;

public class keyword_finally {

	public static void main(String[] args) {
		
		int a=1;
		int b=3;
		int c=0;
		try {
			System.out.println((a+b)/c);
		}catch(Exception e) {
			
			System.out.println("Exception caught");
		}

		finally{  //Finally block will always run if error occurs or not
			System.out.println("Finally block activated ");
		}
	}

}
