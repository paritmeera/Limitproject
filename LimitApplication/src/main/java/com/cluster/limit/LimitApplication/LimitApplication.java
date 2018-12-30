package com.cluster.limit.LimitApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LimitApplication {

	public static void main(String[] args) {
		System.out.println("Inside main ");
		SpringApplication.run(LimitApplication.class, args);
	}

}

