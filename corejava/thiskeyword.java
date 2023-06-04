package corejava;

public class thiskeyword {

	int a,b;
	
	thiskeyword(int a, int b){
		
		this.a=a;
		this.b=b;
		
	}
	
	void display(thiskeyword t) {
		System.out.println("A ="+a);
		System.out.println("B ="+b);
	}
	
	void get() {
		this.display(this);
	}
	
	public static void main(String[] args) {
		thiskeyword t1=new thiskeyword(1,21);
        t1.get();
	}

}
