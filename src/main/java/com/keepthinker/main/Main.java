package com.keepthinker.main;

import org.apache.log4j.Logger;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.keepthinker.Capital;
import com.keepthinker.HelloChina;
import com.keepthinker.People;
import com.keepthinker.President;
import com.keepthinker.dao.support.CountryJDBCTemplate;

public class Main {
	public static Logger logger=Logger.getLogger(Main.class);
	public static void main(String[] args){
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		context.start();
		HelloChina hello=(HelloChina)context.getBean("helloChina");
		logger.debug(hello.getMessage3());
		logger.debug(hello.getMessage2());
		logger.debug(hello.getCapital().getId());
		logger.debug(hello.getPresident().getName());
		for(String pro:hello.getProvinces()){
			logger.debug(pro);
		}
		logger.debug(hello.getSpecialAreas());
		logger.debug(hello.getRegions());
		logger.debug(hello.getPeople().getPopulation());
		context.stop();
		context.registerShutdownHook();
		
		AbstractApplicationContext context2=new ClassPathXmlApplicationContext("database.xml");
		CountryJDBCTemplate jdbc=(CountryJDBCTemplate)context2.getBean("studentJDBCTemplate");
		
		HelloChina china=new  HelloChina(new Capital("Beijing", 1), new President("Xi Jingping"), null, null, null);
		china.setPeople(new People(1400000000));
		jdbc.create(china);
	}
}
