package org.example.di07;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.ArrayList;

@SpringBootApplication
public class Di04Application {

	public static void main(String[] args) {
		SpringApplication.run(Di04Application.class, args);

		/*
		ArrayList<String> userLists = new ArrayList<>();
		userLists.add("홍길동");
		userLists.add("박문수");

		BoardListTO listTO = new BoardListTO();
		 */

		/*
		BoardTO to1 = new BoardTO();
		to1.setSeq(1);
		to1.setSubject("제목 1");

		BoardTO to2 = new BoardTO();
		to2.setSeq(2);
		to2.setSubject("제목 2");

		ArrayList<BoardTO> boardLists = new ArrayList<>();
		boardLists.add(to1);
		boardLists.add(to2);

		BoardListTO listTO = new BoardListTO();
		listTO.setBoardLists(boardLists);

		*/


		GenericXmlApplicationContext ctx
			= new GenericXmlApplicationContext("classpath:context2.xml");

		BoardListTO listTO = (BoardListTO) ctx.getBean("listTO");

		for (String user : listTO.getUserLists()) {
			System.out.println(user);
		}

		for (BoardTO to : listTO.getBoardLists()) {
			System.out.println(to);
		}


	}
}
