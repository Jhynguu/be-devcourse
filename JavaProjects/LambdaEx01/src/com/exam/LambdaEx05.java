package com.exam;

public class LambdaEx05 {
    public static void execute(LambdaInter5 f) {
        f.run();
    }

    public static void main(String[] args) {
        LambdaInter5 f = () -> System.out.println("Hello Lambda 1");
        execute(f);
        execute(() -> System.out.println("Hello Lambda 2"));
    }
}
