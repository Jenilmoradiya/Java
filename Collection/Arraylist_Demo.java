package com.Collection;
import java.util.*;
public class Arraylist_Demo {

	public static void main (String[] args) {
		
		ArrayList lis=new ArrayList();
		
		lis.add(99);
		lis.add(99.99);
		lis.add(false);
		lis.add(null);
		lis.add(99);
		lis.add("Jenil");
		
		System.out.println(lis);
		
		//Methods
		System.out.println("***********Methods*************");
		System.out.println(lis.isEmpty());
		System.out.println(lis.indexOf(99.99));
		System.out.println(lis.get(3));
		
		//iterator
		System.out.println("************Iterator************");
		
        Iterator itr=lis.iterator();
        while(itr.hasNext()) {
        System.out.println(itr.next());
		}
        
        //listiterator
        System.out.println("**********Listiterator*********");
      
        ListIterator al=lis.listIterator();
        	while(al.hasNext()) {
        		al.set(al.next()+"Good day");
        
        	}
        	al=lis.listIterator();           //it is used to fetch data else it wont print all data    
            while(al.hasNext()) {
        	System.out.println(al.next());
        }
 
	     //Reverse
         System.out.println("*************Reverse***********");
         
         while(al.hasPrevious()){
         System.out.println(al.previous());
         
         }
	}
}
