package com.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoTest 
{
	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com");
		context.refresh();
	}
}
