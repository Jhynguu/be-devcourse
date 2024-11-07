package com.exception;

public class ExceptionEx07 {
    public static void main(String[] args) {
        System.out.println("시작");

        int num1 = 0;
//        int num1 = 10;
        int num2 = 100;

        System.out.println("1");
        try {
            System.out.println("2");
            int result = num2 / num1;
            System.out.println("3");
            System.out.println("결과 : " + result);
        } catch (ArithmeticException e) {
            System.out.println("4");
            System.out.println("Exception 발생");
        } finally {
            System.out.println("5");
        }

        System.out.println("끝");
    }
}