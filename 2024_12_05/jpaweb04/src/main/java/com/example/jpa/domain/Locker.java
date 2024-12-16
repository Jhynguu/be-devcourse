package com.example.jpa.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
@Entity
public class Locker {
    @Id
    @Column(name = "locker_id")
    private int id;
    private String name;

}
