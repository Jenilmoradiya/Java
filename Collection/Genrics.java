package com.Collection;
import java.util.*;

public class Genrics {

	public static <E> void printarray(E[] inputarray) {
		
		for (E e: inputarray) {
			System.out.println(e);
		}
		
	}
	
	public static void main(String[] args) {
		
		Integer intarray[]= {1,2,3};
		Double doublearray[]= {1.1};
		
		printarray(doublearray);
		

	
	}
}
