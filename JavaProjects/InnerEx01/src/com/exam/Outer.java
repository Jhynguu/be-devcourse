package com.exam;

public class Outer {
    private int x1 = 100;
    public int x2 = 100;

    public Outer() {
        System.out.println("Outer : " + this);
    }
    // 인스턴스 내부 클래스
    public static class Inner {
        private int y1 = 200;
        public int y2 = 200;

        public Inner() {
            System.out.println("Inner : " + this);
        }

        public void viewInner() {
            System.out.println("viewInner 호출");

//            System.out.println(x1);
//            System.out.println(x2);
            System.out.println(y1);
            System.out.println(y2);
        }
    }
}
