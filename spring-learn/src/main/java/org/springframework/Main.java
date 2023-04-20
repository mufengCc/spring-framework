package org.springframework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.service.UserService;
import org.springframework.service.impl.UserServiceImpl;

public class Main {
	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:AopTest.xml");

		UserService appConfig = applicationContext.getBean("userServiceImpl", UserService.class);
		System.out.println("代理对象:" + appConfig);
		appConfig.test();
	}

}