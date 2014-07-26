package com.keepthinker;

import org.apache.log4j.Logger;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello")
public class HelloController{
	private Logger logger=Logger.getLogger(HelloController.class);
	@RequestMapping(method=RequestMethod.GET)
	public String presentHello(ModelMap map){
//		System.out.println("asdf");
		
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
		HelloWorld hello=(HelloWorld)context.getBean("helloWorld");
		logger.debug(hello.getMessage1());	
		map.addAttribute("name", hello.getMessage1());
		return "hello";
	}
}
