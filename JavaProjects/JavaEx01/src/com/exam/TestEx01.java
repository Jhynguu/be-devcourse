package com.exam;

public class TestEx01 {
    public static void main(String[] args) {
//        System.out.println("Hello World");
//        System.out.println("Hello World");

        System.out.println(args.length);

        // tab 키
        for (String arg : args) {
            System.out.println(arg);
        }

        Parent parent = new Parent() {
            @Override
            public void method() {

            }
        };
        Person person = new Person();
    }
}
