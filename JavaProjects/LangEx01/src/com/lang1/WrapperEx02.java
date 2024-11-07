package com.lang1;

public class WrapperEx02 {
    public static void main(String[] args) {
        // Wrapper class 생성

        // 지금
        Integer i1 = Integer.valueOf(10);
        // 예전
        // Integer i2 = new Integer(10);
        // Auto Boxing
        Integer i2 = 10;

        // i1 참조 자료형 / i3 기본 자료형
        // UnBoxing
        int i3 = i1;
        int sum = i1 + i2;
        System.out.println(sum);
    }
}
