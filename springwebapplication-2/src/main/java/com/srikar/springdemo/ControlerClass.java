package com.srikar.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControlerClass {
	
	
	@Autowired
	public ServiceInter ser;
	
	@GetMapping("/books")
	public String method1() {
		return ser.Display();
	}

}
