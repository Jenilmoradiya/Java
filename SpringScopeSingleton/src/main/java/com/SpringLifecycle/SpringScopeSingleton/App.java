package com.SpringLifecycle.SpringScopeSingleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
Here the scope is Singleton in Beans.xml so both Student s object will get print.
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ac=new ClassPathXmlApplicationContext("Beans.xml");
        Student s=ac.getBean("s1",Student.class);
        s.setId(0);
        s.setFname("Jenil");
        s.setLname("Moradiya");
        System.out.println(s);
        
        Student s2=ac.getBean("s1",Student.class);
        System.out.println(s2);
    }
}
