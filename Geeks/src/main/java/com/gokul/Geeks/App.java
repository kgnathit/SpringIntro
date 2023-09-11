package com.gokul.Geeks;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args)
	{
		/*
		 * School edu =new School(); edu.study();
		 */
		/*
		 * education obj =new College(); obj.study();
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		education obj=(education)context.getBean("education");
		obj.study();
	}

}

