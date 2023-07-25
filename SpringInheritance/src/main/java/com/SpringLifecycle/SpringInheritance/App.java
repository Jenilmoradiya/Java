package com.SpringLifecycle.SpringInheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ac=new ClassPathXmlApplicationContext("Beans.xml");
        Manager m=(Manager)ac.getBean("s1");
        System.out.println(m);
    }
}
