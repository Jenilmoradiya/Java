package com.Spring.DiByObject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ac=new ClassPathXmlApplicationContext("Beans.xml");
        Person p=(Person)ac.getBean("s2");
        p.PersonMethod();
        
    }
}
