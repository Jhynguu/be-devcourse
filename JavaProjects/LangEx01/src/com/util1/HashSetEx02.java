package com.util1;

import java.util.HashSet;

public class HashSetEx02 {
    public static void main(String[] args) {
        Person p1 = new Person("홍길동", 31);
        Person p2 = new Person("박문수", 33);
        Person p3 = new Person("임꺽정", 35);

        HashSet<Person> set = new HashSet<>();
        set.add(p1);
        set.add(p2);
        set.add(p3);

        System.out.println(set);

        Person p4 = new Person("홍길동", 31);
        set.add(p4);

        System.out.println(set);

    }
}
