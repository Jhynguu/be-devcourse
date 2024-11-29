package com.example.boot;

import org.springframework.boot.ApplicationArguments;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ArgumentTest {
    public ArgumentTest(ApplicationArguments args) {

        // false
        System.out.println("foo : " + args.containsOption("foo"));
        // true
        System.out.println("bar : " + args.containsOption("bar"));

        boolean bar = args.containsOption("bar");
        List<String> files = args.getNonOptionArgs();
        if (bar) {
            System.out.println(files);
        }

        // java *.jar --option a --value b
    }
}
