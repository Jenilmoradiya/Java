package com.Collection;
import java.util.*;

public class hashmap {

	public static void main(String[] args) {
		
		HashMap map=new HashMap();
          
		map.put(111, "jenil");
		map.put(222, true);
		map.put(333, 1);
		map.put(121, 99.9);
		//It will replace name if key is same
		map.put(111, "replaced");
		map.put(231, 1);
		
		System.out.println(map);
		
		//methods
		System.out.println("**********methods********");
		System.out.println(map.get(1));
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());
		
		
		//hashmap dont have iterator so we will use iterator with the help of Set method and entryset
		//Entryset is used to form array like structure means [] will be added to output rateher than{}
		
		Set set=map.entrySet();
		
		Iterator al=set.iterator();
		while(al.hasNext()) {
		
			System.out.println(al.next());
	   }
	}
}
