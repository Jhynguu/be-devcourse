package com.test;

public class Parent {
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;
    public Parent() {
        System.out.println("Parent Constructor");
    }
}
