package com.example.boot.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;

@AllArgsConstructor
@ToString
public class User2 {

    private String fullname;
    private int age;
}
