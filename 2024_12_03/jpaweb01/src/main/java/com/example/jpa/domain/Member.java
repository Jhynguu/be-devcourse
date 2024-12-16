package com.example.jpa.domain;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
//@Entity(name = "member1")
@Entity
@ToString
public class Member {
    @Id
    // mariadb auto_increment
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // mariadb sequence
    //@GeneratedValue(strategy = GenerationType.AUTO)
    // Calmel Case -> DB에는 Snake Case로 나옴
    private int id;
    // insert 못하게
    //@Column(insertable = false)
    // update 못하게
    //@Column(updatable = false)
    private String name;
    private String age;

    public Member(String name, String age) {
        this.name = name;
        this.age = age;
    }
}
