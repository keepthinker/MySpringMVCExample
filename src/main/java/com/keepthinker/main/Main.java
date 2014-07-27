package com.keepthinker.main;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.keepthinker.HelloChina;

public class Main {
	public static Logger logger=Logger.getLogger(Main.class);
	public static void main(String[] args){
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		HelloChina hello=(HelloChina)context.getBean("helloChina");
		logger.debug(hello.getMessage3());
		logger.debug(hello.getMessage2());
		logger.debug(hello.getCapital().getId());
		logger.debug(hello.getPresident().getName());
		logger.debug(hello.getProvices());
		logger.debug(hello.getSpecialAreas());
		logger.debug(hello.getRegions());
		logger.debug(hello.getPeople().getPopulation());
	}
}
