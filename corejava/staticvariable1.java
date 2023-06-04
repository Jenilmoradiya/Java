package corejava;


class old{
	
	String name;
	int rollno;
	static String companyname = "JDM";
	
	old(String name,int rollno)
	{
		this.name=name;
		this.rollno=rollno;
	}
	void get()  
	{
		System.out.println("name ="+name );
	    System.out.println("rolllno =" +rollno);
	    System.out.println("companyname =" +companyname);
	}
}




public class staticvariable1 {

	public static void main(String[] args) {
	 old d= new old("Jenil",1);
	 d.get();
	 old d1= new old("herik",2);
	 d1.get();
	}

}
