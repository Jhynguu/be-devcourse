package org.example.di06;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Di05Application {

	public static void main(String[] args) {
		SpringApplication.run(Di05Application.class, args);

		AnnotationConfigApplicationContext ctx
				= new AnnotationConfigApplicationContext(BeanConfig.class);

		WriteAction writeAction1 = ctx.getBean("writeAction1", WriteAction.class);
		writeAction1.execute();

		WriteAction writeAction2 = ctx.getBean("writeAction2", WriteAction.class);
		writeAction2.execute();

		Action writeAction3 = ctx.getBean("writeAction3", Action.class);
		writeAction3.execute();

		ctx.close();
	}

}
