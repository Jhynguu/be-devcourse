package com.util1;

import java.util.ArrayList;

public class ArrayListEx02 {
    public static void main(String[] args) {
        ArrayList ar = new ArrayList();

        // 기본 자료형
        // Object
        // 10
        Integer i = Integer.valueOf(30);
        Object obj = i;
        ar.add(obj);
        // Auto Boxing + 형변환
        ar.add(10);
        ar.add(20);

        System.out.println(ar);
        // 형변환 + unBoxing
        int i1 = (Integer)ar.get(0);
        System.out.println(i1);

    }
}
