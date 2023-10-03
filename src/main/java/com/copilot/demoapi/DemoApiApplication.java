package com.copilot.demoapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApiApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(DemoApiApplication.class, args);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
