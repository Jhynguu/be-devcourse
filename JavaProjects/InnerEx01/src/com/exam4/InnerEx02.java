package com.exam4;

public class InnerEx02 {
    private int y = 200;

    public void doInner() {
        int x = 100;

        System.out.println("외부 : " + this);
        new InterA() {
            @Override
            public void viewInner() {
                System.out.println("viewInner 호출");
                System.out.println("내부 : " + this);
                System.out.println("외부 : " + InnerEx02.this);

                // System.out.println("내부 : " + this.y);
                System.out.println("내부 : " + InnerEx02.this.y);
            }
        }.viewInner();
    }
    public static void main(String[] args) {
        InnerEx02 inner = new InnerEx02();
        inner.doInner();
    }
}
