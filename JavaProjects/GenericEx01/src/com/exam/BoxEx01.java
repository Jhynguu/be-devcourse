package com.exam;

public class BoxEx01 {
    public static void main(String[] args) {
        // List
        // 타입 안전성이 없음
        Box1 box1 = new Box1();

        // 문자열
        box1.setObject(new String("홍길동"));

        String name = (String)box1.getObject();
        System.out.println(name);

        box1.setObject(Integer.valueOf(10));
        int data = (int)box1.getObject();
        System.out.println(data);
    }
}
