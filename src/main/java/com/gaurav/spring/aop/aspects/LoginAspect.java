package com.gaurav.spring.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import com.gaurav.spring.aop.model.Circle;

@Aspect
public class LoginAspect {
	
	/*@Before("execution(public * get*())")
	public void LoggingAdvice(){
		System.out.println("Advice Run !! getName() Called !!");
	}
	
	@Before("execution(public * get*())")
	public void SecondAdvice(){
		System.out.println("Second Advice Run !! getName() Called !!");
	}*/
	
	/*@Before("allGetters()")
	public void LoggingAdvice(){
		System.out.println("Advice Run !! getName() Called !!");
	}*/
	
	@Before("allCircleMethod()")
	public void LoggingAdvice(JoinPoint joinPoint){
		System.out.println(joinPoint.toString());
		Circle circle = (Circle)joinPoint.getTarget();
	}
	
	@Before("args(name)")
	public void stringArgumentAdvice(String name){
		System.out.println("Setter Called Before"+ name);
	}
	
	@After("args(name)")
	public void stringArgumentAftterAdvice(String name){
		System.out.println("Setter Called After"+ name);
	}
	
	@AfterReturning(pointcut="args(name)", returning="returnValue")
	public void stringArgumentAfterReturningAdvice(String name, String returnValue){
		System.out.println("Setter Called After Returning Argument : "+ name +" Return Value : "+returnValue);
	}
	
	@AfterThrowing(pointcut="args(name)", throwing="ex")
	public void stringArgumentAfterThrowingAdvice(String name, RuntimeException ex){
		System.out.println("Setter Called After Throwing"+ name + " Excption is : "+ ex.getMessage());
	}
	
	@Around("allGetters()")
	public Object aroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
		
		Object returnValue = null;
		try {
			System.out.println("Around Advice - Before Advice");
			returnValue = proceedingJoinPoint.proceed();
			System.out.println("Around Advice - After Advice");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//This is target method invocation
		
		System.out.println("Around Advice - After Finally");
		return returnValue;
	}
	
	/*@Before("allGetters()")
	public void SecondAdvice(){
		System.out.println("Second Advice Run !! getName() Called !!");
	}*/
	
	@Pointcut("execution(* get*())")
	public void allGetters(){}	//Dummy Method. It holds a pointcut expression
	
	@Pointcut("within(com.gaurav.spring.aop.model.Circle)")
	public void allCircleMethod(){}	//Dummy Method. It holds a pointcut expression
	
	
}
