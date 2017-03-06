package com.aop.example.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

	public Integer multiply(int a, int b) {
		
		if(a == 0 && b == 0) {
			throw new IllegalArgumentException("This invalid multiply");
		}
		
		int res = a * b;
		System.out.println(a + "*" + b + "= " + res);
		return res;
	}

}
