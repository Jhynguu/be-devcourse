package com.example.jpa.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
@Entity
public class Member {
    @Id
    @Column(name = "member_id")
    private int id;
    private String name;
    private int age;

    @OneToOne
    @JoinColumn(name = "locker_id")
    private Locker locker;
}
