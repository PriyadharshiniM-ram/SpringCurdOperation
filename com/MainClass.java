package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
	public static void main(String[] args) {
	
		
		
		ApplicationContext con = new AnnotationConfigApplicationContext(Config.class);
		 Zoo z =(Zoo)        con.getBean("zoo");
		 z.getAnimalSound();
	}

}
