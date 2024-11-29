package com.example.aop;

import com.example.aop.model.Target;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Aop01Application implements CommandLineRunner {

	@Autowired
	private ApplicationContext ctx;

	public static void main(String[] args) {
		SpringApplication.run(Aop01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Target target = ctx.getBean( "target", Target.class );
		System.out.println( target.sayEcho( "홍길동" ) );
	}
}
