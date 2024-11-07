package com.exam;

import java.util.function.Function;

public class FunctionEx01 {
    public static void main(String[] args) {
        // formatting 성격도 가지고 있음
        Function<Integer, String> intToString = t -> "해답은 " + String.valueOf(t);
        // System.out.println(intToString.apply(5));
        String data = intToString.apply(5);
        System.out.println(data);
    }
}
