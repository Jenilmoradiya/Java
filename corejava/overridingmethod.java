package corejava;

class tab{
	
	void put() {
	System.out.println("1st ");
	}
	
}

class tab2 extends tab{
	void put() {
		super.put();
		
		System.out.println("2nd");
	}
	
}
class tab3 extends tab2{
	
	void put() {
		super.put();
		System.out.println("3rd");
	}
}


public class overridingmethod {

	public static void main(String[] args) {
		tab3 t1=new tab3();
		t1.put();

	}

}
