package com.aop.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aop.example.service.CalculatorService;

@RestController
public class CalculatorController {

	@Autowired
	private CalculatorService service;
	
	@RequestMapping(method = RequestMethod.GET, value = "/calculator")
	public String hello() {
		return "hello";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/calculator/multiply/{operator1}/{operator2}")
	public Integer multiply(@PathVariable Integer operator1, @PathVariable Integer operator2) {
		return service.multiply(operator1, operator2);
	}
	
}
