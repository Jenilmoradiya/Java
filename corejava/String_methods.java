package corejava;


public class String_methods {

	public static void main(String[] args) {
		String a= "jenil";
		String b= "MORADIYA";
		String c= "        Trim";
		
		System.out.println(a.toUpperCase());
		System.out.println(b.toLowerCase());
		
		
		System.out.println(c.trim());
		System.out.println(a.replace('i','e'));
		
		
		System.out.println(b.charAt(2));
		System.out.println(c.length());
		
		 
		System.out.println(a.concat(b));
	}

}
