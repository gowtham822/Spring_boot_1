package com.tcs.in.Spring_boot_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBoot1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringBoot1Application.class, args);
		
		Service bean = run.getBean(Service.class);
		
		System.out.println(bean);
		
		Service bean1 = run.getBean(Service.class);
		
		
		System.out.println(bean1);
		
	}

}
