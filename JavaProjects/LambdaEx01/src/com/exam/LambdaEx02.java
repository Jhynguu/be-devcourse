package com.exam;

public class LambdaEx02 {
    public static void main(String[] args) {
        LambdaInter2 f = new LambdaInter2() {
            @Override
            public void method1() {
                System.out.println("method1 호출");
            }

            // @Override
            // public void method2() {
            //     System.out.println("method2 호출");
            // }
        };

        f.method1();
        // f.method2();

        // Lambda로 변경
        // 인터페이스 안에 메소드가 2개 이상이면 람다식 변경 불가
        f = () -> { System.out.println("method1 호출"); };
    }
}
