package com.lang1;

public class ObjectEx01 {
    public static void main(String[] args) {

        // Object 클래스 생성
        Object obj1 = new Object();

        // java.lang.Object(자료형)@41629346(해시코드) (참조 주소값)
        System.out.println(obj1);
        System.out.println(obj1.toString());

        // 자료형만 분리
        System.out.println(obj1.getClass().getName());

        String className = obj1.getClass().getName();
        System.out.println(className);

        // 1096979270 (해시코드 분리)
        System.out.println(obj1.hashCode());
        // 10진수 -> 16진수 출력
        System.out.printf("%x\n", obj1.hashCode());

//        Person person = new Person();
//        System.out.println(person);
//        // Object toString() 호출
//        System.out.println(person.toString());
    }
}
