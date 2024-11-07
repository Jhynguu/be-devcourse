package com.exam4;

public class InnerEx {
    public static void main(String[] args) {
        // 익명 Inner 클래스
        // 참조변수 사용

        // 추상클래스 / 인터페이스 경우에 사용
        // 상속 / 구현 = > 하지않고 추상 메서드를 정의해서 사용

        // 인스턴스화 하면서 메서드 오버라이드
        // 참조변수 없음

        int x = 100;
        new InterA() {
            @Override
            public void viewInner() {
                System.out.println("viewInner 호출");
                // 외부의 지역변수 접근 가능
                System.out.println("x : " + x);
            }
        }.viewInner();

        InterA ia = new InterA() {
            @Override
            public void viewInner() {
                System.out.println("viewInner 호출");
            }
        };

        ia.viewInner();

        new InterB() {
            @Override
            public void viewInner() {
                System.out.println("추상클래스의 viewInner 호출");
            }
        }.viewInner();
    }
}
