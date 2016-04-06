package com.gaurav.spring.demo6;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DisplayNameBeanPostProcessor implements BeanPostProcessor{
	
	//bean object and bean name defined
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("In postProcessBeforeInitialization. Bean name : "  + beanName);
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("In postProcessAfterInitialization. Bean name : " + beanName);
		return bean;
	}

}
