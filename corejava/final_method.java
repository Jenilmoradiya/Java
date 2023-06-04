package corejava;


class final_1{
	 final void syso() { // you will not able to override
		int a=3;
		int b=4;
		System.out.println(a*b);
	}
}
	class final_2 extends final_1{
		
		void syso(){ //there should be same parameters or both default methods
	     int c=10;
	     int d=11;
	     System.out.println(c+d);
		}
		
	   }
	
public class final_method {

	public static void main(String[] args) {
	      final_2 fi=new final_2();
	      fi.syso();

	}

}
