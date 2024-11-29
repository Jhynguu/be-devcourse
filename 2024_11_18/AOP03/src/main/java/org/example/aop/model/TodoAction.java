package org.example.aop.model;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service("todo")
public class TodoAction implements Todo {

    @Override
    public List<String> todoList() {
        System.out.println("todoList() 호출");
        return Arrays.asList("Spring Framework", "Spring Boot");
    }
}
