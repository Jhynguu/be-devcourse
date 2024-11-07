package com.exam3;

public class InnerEx {
    // 메서드
    public static void main(String[] args) {

        // 지역변수
        // readonly(상수)
        int x = 200;

        class Inner {
            private int y1 = 100;
            public int y2 = 100;

            Inner() {
                System.out.println("Inner : " + this);
            }

            public void viewInner() {
                System.out.println("viewInner 호출");

                System.out.println(y1);
                System.out.println(y2);

                System.out.println(x);

                // 연산 (접근은 가능하지만 연산 불가능)
                // x++;
                // System.out.println(x);
            }
        }

        // 인스턴스화
        Inner inner = new Inner();
        inner.viewInner();
    }
}
