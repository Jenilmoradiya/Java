package com.Spring.DiByConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
 
    	ApplicationContext ac=new ClassPathXmlApplicationContext("Beans.xml");
    	Student s=(Student)ac.getBean("s1");
    	System.out.println(s);
    
    }
    
}
