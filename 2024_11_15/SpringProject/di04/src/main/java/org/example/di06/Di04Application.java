package org.example.di06;

import org.example.di06.WriteAction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.GenericXmlApplicationContext;

@SpringBootApplication
public class Di04Application {

	public static void main(String[] args) {
		SpringApplication.run(Di04Application.class, args);

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:context.xml");

		WriteAction action = (WriteAction) ctx.getBean("action");
		action.execute();

		ctx.close();
	}
}
