package com.io.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.io.spring.service.MessageService;

@SpringBootApplication
public class CommanLinnerProjectApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext configurableApplicationContext=SpringApplication.run(CommanLinnerProjectApplication.class, args);
	MessageService messageService = configurableApplicationContext.getBean(MessageService.class);
	String message=messageService.message();
	String message1=messageService.sayHi();
	System.out.println(message);
	System.out.println(message1);
	
	
	
	
	}
}
