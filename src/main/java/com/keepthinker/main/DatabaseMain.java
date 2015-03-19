package com.keepthinker.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.keepthinker.dao.DaoService;
import com.keepthinker.dao.support.DaoServiceImpl;

public class DatabaseMain {
	public static void main(String[] args){
		((DaoService)new ClassPathXmlApplicationContext("classpath:appContext.xml","classpath:hibernateContext.xml").
		getBean(DaoServiceImpl.class)).printlnByCityId(2);
	}
}
