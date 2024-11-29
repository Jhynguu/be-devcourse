package com.example.model.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class FormTO {
    private String userid;
    private String userpw;

    public FormTO() {
    }
}
