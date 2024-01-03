package com.whn.spring.demo.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.whn.spring.demo.config")
public class ImportSelectorTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac
				= new AnnotationConfigApplicationContext(ImportSelectorTest.class);
		TestConfig bean = ac.getBean(TestConfig.class);
		System.out.println(bean);
	}
}
