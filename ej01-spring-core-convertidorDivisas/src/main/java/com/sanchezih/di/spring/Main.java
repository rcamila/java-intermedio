package com.sanchezih.di.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sanchezih.di.spring.service.Converter;
import com.sanchezih.di.spring.service.impl.ARSToGBPConverter;
import com.sanchezih.di.spring.service.impl.ARSToUSDConverter;

public class Main {

	public static void main(String[] args) {

		double cantidad = 100;
		//Converter c = new ARSToUSDConverter();
		//System.out.println(c.convert(cantidad));

		ApplicationContext appContext = new ClassPathXmlApplicationContext("appContext.xml");
	
		Converter c = (Converter) appContext.getBean("convToGBP");
		System.out.println(c.convert(cantidad));
			
	}
}
