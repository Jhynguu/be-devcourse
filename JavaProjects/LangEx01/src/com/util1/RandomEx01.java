package com.util1;

import java.util.Random;

public class RandomEx01 {
    public static void main(String[] args) {
        // Random rand1 = new Random();
        // seed
        // 이 방법을 더 많이 씀
        Random rand1 = new Random(System.currentTimeMillis());

//        System.out.println(rand1.nextDouble());
//        System.out.println(rand1.nextDouble());
//        System.out.println(rand1.nextInt());
//        System.out.println(rand1.nextInt());

        // 0 <= 값 < 10 정수
        System.out.println(rand1.nextInt(10));
        System.out.println(rand1.nextInt(10));

        // 1 <= 로또 < 46
        System.out.println(rand1.nextInt(45) + 1);
    }
}
