package corejava;


class meth{
	
	void put() {
		System.out.println("HIIIII");
	}
    
	void put(int a,int b) {
		int x=a;
		int y=b;
		System.out.println("value of a and b is =" +a );
		System.out.println("value of a and b is =" +b );
	}
}



public class methodoverloading {

	public static void main(String[] args) {
		meth m1=new meth();
		m1.put();
		m1.put(1,21);

	}

}
