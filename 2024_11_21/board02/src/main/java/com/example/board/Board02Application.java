package com.example.board;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.board.mapper")
public class Board02Application {

	public static void main(String[] args) {
		SpringApplication.run(Board02Application.class, args);
	}

}
