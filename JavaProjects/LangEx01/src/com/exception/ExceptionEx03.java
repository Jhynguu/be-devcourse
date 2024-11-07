package com.exception;

import java.util.Date;

public class ExceptionEx03 {
    public static void main(String[] args) {
        System.out.println("시작");

        Date date1 = new Date();
        Date date2 = null;

        System.out.println(date1.toLocaleString());

        if (date2 != null) {
            System.out.println(date2.toLocaleString());
        } else {
            System.out.println("객체가 생성되지 않음");
        }

        System.out.println("끝");


    }
}
