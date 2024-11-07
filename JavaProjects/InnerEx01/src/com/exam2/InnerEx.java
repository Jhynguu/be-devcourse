package com.exam2;

public class InnerEx {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer.Inner();
        // 접근 지정자
        // System.out.println(inner.y1);
        System.out.println(inner.y2);

        inner.viewInner();
    }
}
