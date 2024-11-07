package com.io1;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private String phone;
    private int age;
    private String addreess;

    public Person(String name, String phone, int age, String addreess) {
        this.name = name;
        this.phone = phone;
        this.age = age;
        this.addreess = addreess;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

    public String getAddreess() {
        return addreess;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                ", addreess='" + addreess + '\'' +
                '}';
    }
}