package com.jashu.springtest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main(String[] args)
    {
	ApplicationContext context = new ClassPathXmlApplicationContext("file:spring.xml");

	System.out.println("Hello World!");
	Vehicle obj = (Vehicle) context.getBean("car");
	obj.drive();

	// Tyre tyre = (Tyre) context.getBean("tyre");
	// System.out.println(tyre);
    }

}
