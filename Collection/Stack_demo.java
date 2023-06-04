package com.Collection;
import java.util.*;

public class Stack_demo {

	public static void main(String args[]) {
		
		Stack st=new Stack();
		
		st.push(2);
		st.push(0000);
		st.push(432);
		st.push(34243);
		st.push(43);
		
		
		st.pop();
		
		st.peek();
		
		st.push(22);
		st.push(4);
		
		System.out.println(st);
	}
}
