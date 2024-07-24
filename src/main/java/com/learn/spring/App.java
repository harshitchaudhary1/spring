package com.learn.spring;

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
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/learn/spring/config.xml");
    	student student1 = (student)context.getBean("student1");
    	student student2 = (student)context.getBean("student2");
    	System.out.println(student1);
    	System.out.println(student2);
    }
}
