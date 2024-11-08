package com.exam2;

public class Outer {
    private int x1 = 100;
    public int x2 = 100;

    Outer() {
        System.out.println("Outer : " + this);
    }
    static class Inner {
        private int y1 = 200;
        public int y2 = 200;

        Inner() {
            System.out.println("Inner : " + this);
        }

        public void viewInner() {
            System.out.println("viewInner 호출");

            // 직접 접근 불가
            // System.out.println(x1);
            // System.out.println(x2);

            System.out.println(y1);
            System.out.println(y2);
        }
    }
}
