package com.util1;

import java.util.Random;

public class LottoEx01 {
    public static void main(String[] args) {
        Random rand1 = new Random(System.currentTimeMillis());

        // 중복 처리 알고리즘 추가해야함~
        for(int i = 1; i <= 5; i++) {
            System.out.print(i + "회\t");
            for (int j = 1; j <= 5; j++) {
                System.out.print(rand1.nextInt(45) + 1 + "\t");
            }
            System.out.println();
        }

//        for(int i = 1; i <= 5; i++) {
//            for(int j = 1; j <= 5; j++) {
//                System.out.printf("%2d ", rand1.nextInt(45) + 1);
//            }
//            System.out.println();
//        }
    }
}
