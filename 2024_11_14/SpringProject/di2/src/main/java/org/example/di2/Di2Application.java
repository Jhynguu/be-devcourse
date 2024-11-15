package org.example.di2;

import org.example.model.HelloBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.GenericXmlApplicationContext;

@SpringBootApplication
public class Di2Application {

	public static void main(String[] args) {
		SpringApplication.run(Di2Application.class, args);

		GenericXmlApplicationContext ctx
			= new GenericXmlApplicationContext("classpath:context.xml");

		// prototype
		// 객체 변수의 참조값이 다르게 나옴
		// hellobean11org.example.model.HelloBean@3bc023a9
		// hellobean12org.example.model.HelloBean@214b4dcb
		//HelloBean helloBean11 = (HelloBean) ctx.getBean("helloBean11");
		//HelloBean helloBean12 = (HelloBean) ctx.getBean("helloBean12");
		//System.out.println("hellobean11" + helloBean11);
		//System.out.println("hellobean12" + helloBean12);

		// new가 발생 -> 참조변수가 다시 나옴
		// hellobean13org.example.model.HelloBean@67e4a603
		// 총 생성자 호출 3번 발생
		//HelloBean helloBean13 = (HelloBean) ctx.getBean("helloBean11");
		//System.out.println("hellobean13" + helloBean13);

		//helloBean11.sayHello("홍길동");
		//helloBean12.sayHello("박문수");

		// singleton (static)
		// 이름이 달라도 같은 참조값이 나와야 함
		//HelloBean helloBean21 = (HelloBean) ctx.getBean("helloBean21");
		//HelloBean helloBean22 = (HelloBean) ctx.getBean("helloBean22");

		//System.out.println("hellobean21" + helloBean21);
		//System.out.println("hellobean22" + helloBean22);

		// 기존에 있던 값을 다른 이름으로 사용 가능
		// 생성자 호출 2번
		//HelloBean helloBean23 = (HelloBean) ctx.getBean("helloBean21");
		//System.out.println("hellobean23" + helloBean23);

		ctx.close();
	}

}
