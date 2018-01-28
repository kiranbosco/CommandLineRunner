package com.io.spring.service;

import java.util.Arrays;
import java.util.stream.Collectors;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ApplicationRunnerBean implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {

		String collectorStr =Arrays.stream(args).collect(Collectors.joining(","));
		System.out.println(collectorStr);
		
	
	}
 
}
