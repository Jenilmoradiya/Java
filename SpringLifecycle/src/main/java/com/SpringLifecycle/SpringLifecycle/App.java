package com.SpringLifecycle.SpringLifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**

We have made two methods  in manager that is init and desgtroy, any name can be given to these method.
As we have made methods only sevice method and init method will be called.
so to call destroy method we will mention init and destroy inbuilt method in beans.xmal
To print destroy method we will have to use abstractApplicationContext
Also have to use registerShutdown method
 */
public class App 
{
    public static void main( String[] args )
    {
         AbstractApplicationContext ac=new ClassPathXmlApplicationContext("Beans.xml");
         Manager m=(Manager)ac.getBean("s1");
         System.out.println(m);
         ac.registerShutdownHook();
    }
}
