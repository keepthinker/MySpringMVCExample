package com.keepthinker;

import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InitHelloClass implements BeanPostProcessor {

	private Logger logger=Logger.getLogger(InitHelloClass.class);
	public Object postProcessBeforeInitialization(Object bean,
			String beanName) throws BeansException {
		logger.debug("BeforeInitialization : " + beanName);
		return bean;  // you can return any other object as well
	}

	public Object postProcessAfterInitialization(Object bean,
			String beanName) throws BeansException {
		logger.debug(bean.getClass().getName()==HelloWorld.class.getName()?"I am a HelloWorld Object":"I am not a HelloWorld Object");
		logger.debug("AfterInitialization : " + beanName);
		return bean;  // you can return any other object as well
	}

}