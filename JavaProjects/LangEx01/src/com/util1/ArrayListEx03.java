package com.util1;

import java.util.ArrayList;

public class ArrayListEx03 {
    public static void main(String[] args) {

        // 내부 데이터의 자료형을 일치시키기
        // Generic
        ArrayList al = new ArrayList();

        al.add("A");
        al.add("B");
        al.add(10);
        al.add(20);
        al.add('a');
        al.add('b');

        System.out.println(al);

        // 데이터 안전성이 안 좋다
        // for
//        for (int i = 0; i < al.size(); i++) {
//            String data = (String) al.get(i);
//            System.out.println(data);
//        }

        ArrayList<String> al2 = new ArrayList();
        al2.add("aa");
        al2.add("bb");
        al2.add("cc");

        for(int i = 0; i < al2.size(); i++) {
            String data = al2.get(i);
            System.out.println(data);
        }

        // 향상된 for문
        for (String data : al2) {
            System.out.println(data);
        }
    }
}
