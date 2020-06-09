package com.srikar.springdemo;

import org.springframework.stereotype.Component;

@Component
public class LogicClass implements ServiceInter {


	public String Display() {

		return "hello_world";
	}

}
