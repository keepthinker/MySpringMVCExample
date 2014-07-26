package com.keepthinker;

import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InitHelloWorld implements BeanPostProcessor {

	private Logger logger=Logger.getLogger(InitHelloWorld.class);
	public Object postProcessBeforeInitialization(Object bean,
			String beanName) throws BeansException {
		logger.debug("BeforeInitialization : " + beanName);
		return bean;  // you can return any other object as well
	}

	public Object postProcessAfterInitialization(Object bean,
			String beanName) throws BeansException {
		logger.debug("AfterInitialization : " + beanName);
		return bean;  // you can return any other object as well
	}

}