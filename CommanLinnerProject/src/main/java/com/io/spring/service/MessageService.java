package com.io.spring.service;

import org.springframework.stereotype.Service;

@Service
public class MessageService {
	
	public String message() {
		return "HelloWorld";
	}
	
	public String sayHi() {
		return "HelloGoodMorning";
	}

}
