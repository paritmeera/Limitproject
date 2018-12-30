package com.cluster.limit.LimitApplication;

import org.springframework.web.bind.annotation.RequestMapping;

public class HelloController {
	
	@RequestMapping("/test")
	public String sayhello()
	{
		System.out.println("Inside ");
		return "this is my first application";
	}
	

}
