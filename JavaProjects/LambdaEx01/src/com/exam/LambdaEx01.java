package com.exam;

public class LambdaEx01 {
    public static void main(String[] args) {
        // 1.
        new LambdaInter1() {
            @Override
            public void method() {
                System.out.println("Hello Lambda");
            }
        }.method();

        // 2. => lambda로 바꿀 수 있음
        LambdaInter1 f = new LambdaInter1() {
            @Override
            public void method() {
                System.out.println("Hello Lambda");
            }
        };
        f.method();

        // lambda로 변경하는 메서드의 내용은 간단해야 함
        f = () -> { System.out.println("Hello Lambda 3"); };
        f.method();

        f = () -> System.out.println("Hello Lambda 4");
        f.method();
    }
}
