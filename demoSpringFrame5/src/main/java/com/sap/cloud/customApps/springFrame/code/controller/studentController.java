package com.sap.cloud.customApps.springFrame.code.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class studentController {
	
	@RequestMapping("/studenttest")
	public String helloWorld() {
		return "Hello World with Automation powered by Jenkins !";
		
	}

}
