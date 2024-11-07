package com.lang1;

public class SystemEx03 {
    public static void main(String[] args) {
        // 실행 시간
        // 1970년 1월 1일 00:00:00 부터 현재까지 밀리세컨드로 표시

        // 프로그램 실행시간 측정 측정
        long startTime = System.currentTimeMillis();
        System.out.println(startTime);

        System.out.println();

        System.out.print("hello");
        // System.out.print("\n");
        System.lineSeparator();
        System.out.print("hello");
//        System.out.println("\n");
        System.lineSeparator();
        System.out.print("hello");
        System.lineSeparator();

        // 환경값
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("user.home"));

        System.out.println(System.getenv("PATH"));
    }
}
