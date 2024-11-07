package com.util2;

import java.util.ArrayList;

public class StringEx {
    public static void main(String[] args) {
        // toString() 오버라이딩
        Student stu1 = new Student("1", "홍길동", "100", "100", "100");
        Student stu2 = new Student("2", "박문수", "80", "80", "90");
        Student stu3 = new Student("3", "임꺽정", "60", "100", "80");
        Student stu4 = new Student("4", "장길산", "90", "70", "80");
        Student stu5 = new Student("5", "이몽룡", "70", "90", "70");

        // 2차원 데이터
        ArrayList<Student> al = new ArrayList<>();
        al.add(stu1);
        al.add(stu2);
        al.add(stu3);
        al.add(stu4);
        al.add(stu5);

        System.out.println(al.toString());
        System.out.println(al.size());
    }
}
