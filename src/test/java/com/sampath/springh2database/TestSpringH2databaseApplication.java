package com.sampath.springh2database;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestSpringH2databaseApplication {

	public static void main(String[] args) {
		SpringApplication.from(SpringH2databaseApplication::main).with(TestSpringH2databaseApplication.class).run(args);
	}

}
