package com.lang1;

public class MathEx02 {
    public static void main(String[] args) {
        // 난수 - 임의의 수(로또 : Random)

        // 0 <= 임의값 < 1 double형 실수
        System.out.println(Math.random());
        System.out.println(Math.random());

        // 0에서 9까지 정수
        // 0 * 10(정수) <= 임의값 < 1 * 10(정수)
        // 0 <= 임의값 < 10
        System.out.println((int) (Math.random() * 10));
        System.out.println((int) (Math.random() * 10));

        // 1에서 45까지 정수
        // 0 * 45 + 1 <= 임의값 < 1 * 45 + 1 => 정수화
        System.out.println((int) (Math.random() * 45) + 1);
        System.out.println((int) (Math.random() * 45) + 1);
        System.out.println((int) (Math.random() * 45) + 1);
    }
}
