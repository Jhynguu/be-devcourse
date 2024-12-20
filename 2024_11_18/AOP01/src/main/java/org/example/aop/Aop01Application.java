package org.example.aop;

import org.example.aop.model.Target;
import org.example.aop.model.TargetService;
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
		// 인터페이스
		//Target target = ctx.getBean("target", Target.class);

		// 클래스
		TargetService target = ctx.getBean("target", TargetService.class);

		//System.out.println(target.sayEcho("홍길동"));
		System.out.println(target.sayEcho1("홍길동"));
		//System.out.println(target.sayEcho2("홍길동"));
	}
}
