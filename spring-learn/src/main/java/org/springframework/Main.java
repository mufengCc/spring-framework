package org.springframework;

import org.springframework.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.service.impl.UserServiceImpl;

public class Main {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

		UserServiceImpl appConfig = applicationContext.getBean("userServiceImpl", UserServiceImpl.class);
		appConfig.test();

		System.out.println("Hello world!");
	}
}