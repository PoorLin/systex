package com.systex.demo.lab2;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CommonPointCut {

	@Before("execution(* com.systex.demo.model.Product.*(..))")
	public void abc() {
		System.out.println(123);
		//System.out.println("before execution at :" +joinPoint.getSignature().getDeclaringTypeName()+joinPoint.getSignature().getName());
	}
	
}
