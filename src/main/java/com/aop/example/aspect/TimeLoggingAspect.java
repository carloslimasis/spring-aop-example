package com.aop.example.aspect;

import java.util.Date;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TimeLoggingAspect {

	@Around("execution(* com.aop.example.service.*.*(..))")
	public void userAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("@Around: Before calculation-" + new Date());
		joinPoint.proceed();
		System.out.println("@Around: After calculation-" + new Date());
	}

	@Before("execution(* com.aop.example.service.*.*(..))")
	public void logBefore() {
		System.out.println("@Before:" + new Date());
	}

	@After("execution(* com.aop.example.service.*.*(..))")
	public void logAfter() {
		System.out.println("@After:" + new Date());
	}
	
	@AfterThrowing(pointcut="execution(* com.aop.example.service.*.*(..))", throwing = "ex")
	public void logAfterThrowing(IllegalArgumentException ex) {
		System.out.println("@AfterThrowing: " + ex.getMessage());
	}
}
