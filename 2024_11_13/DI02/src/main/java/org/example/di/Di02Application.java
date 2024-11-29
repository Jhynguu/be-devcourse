package org.example.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Di02Application implements CommandLineRunner {

    @Autowired
    private ApplicationContext ctx;

    public static void main(String[] args) {
        SpringApplication.run(Di02Application.class, args);

        //System.out.println("ctx : " + ctx);

    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("ctx : " + ctx);
        // ctx : org.springframework.context.annotation.AnnotationConfigApplicationContext@555fdd08, started on Mon Nov 18 09:18:04 KST 2024

        WriteAction writeAction = ctx.getBean("writeAction", WriteAction.class);
        System.out.println("writeAction : " + writeAction);

        writeAction.getDAO();
    }
}
