package com.keepthinker.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.keepthinker.HelloChina;

public class Main {
	public static void main(String[] args){
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		HelloChina hello=(HelloChina)context.getBean("helloChina");
		System.out.println(hello.getMessage3() );
	}
}
