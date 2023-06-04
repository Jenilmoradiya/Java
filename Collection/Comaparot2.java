package com.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Comaparot2 implements Comparator<Comaparator_1>{


	public int compare(Comaparator_1 o1, Comaparator_1 o2) {
	int result=0;
	
	    if (o1.getId()>o2.getId()) {
	    	result= 1;
	    }
	    
	    if (o1.getId()<o2.getId()) {
	    	result=-1;
	    	}
	    if(o1.getId()==o2.getId()) {
	    	result=0;
	    }
	    
		return 	result;
	}

public static void main(String[] args) {

	ArrayList<Comaparator_1> arr=new ArrayList<>();
	
	Comaparator_1 e1=new Comaparator_1();
	e1.setId(1);
	e1.setName("Jenil");
	
	Comaparator_1 e2=new Comaparator_1();
    e2.setId(21);
    e2.setName("Herik");
 
    Comaparator_1 e3=new Comaparator_1();
    e3.setId(2);
    e3.setName("om");
    
    arr.add(e1);
    arr.add(e2);
    arr.add(e3);

    Collections.sort(arr,new Comaparot2());
    
    
	for(Comaparator_1 e : arr) {
    	System.out.println("Id="+e.getId() +""+ "Name=" +e.getName() );
    }
}
}


