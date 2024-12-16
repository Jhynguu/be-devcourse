package com.example.jpa.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "user")
public class User {
    @Id
    private Long id;
    private String name;
    private String age;

    protected User() {
    }

    public User(Long id, String name, String age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
