package com.SpringLifecycle.SpringInnerBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 Here we have made inner bean inside bean of s2 id.
 it is similar to DiByObject concept.
 Just we have to add s1 id to s2 id.
 For better knowledge check out DiByObject.
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ac=new ClassPathXmlApplicationContext("Beans.xml");
        Person p=(Person)ac.getBean("s2");
        p.PersonMethod();
    }
}
