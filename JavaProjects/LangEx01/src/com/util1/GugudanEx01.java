package com.util1;

import java.util.Scanner;

public class GugudanEx01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("단수 : ");
        String line = sc.nextLine();
        int dan = Integer.parseInt(line);
        System.out.println(dan + "단 내용 출력");

        for(int i = 1; i < 10; i++) {
            System.out.println(dan + " X " + i + " = " + dan * i);
            // System.out.printf("%s X %s = %s%n", dan, i, (dan * i));
        }
    }
}
