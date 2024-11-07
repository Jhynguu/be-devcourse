package com.exam;

public class Person {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJumin() {
        return jumin;
    }

    public void setJumin(String jumin) {
        this.jumin = jumin;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    String jumin;
    double height;
    double weight;

    public Person(double weight, double height, String jumin, int age, String name) {
        this.weight = weight;
        this.height = height;
        this.jumin = jumin;
        this.age = age;
        this.name = name;
    }

    public Person() {
        System.out.println("Person constructor");
    }
}
