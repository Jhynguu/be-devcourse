package com.util1;

import java.util.Scanner;

public class ScannerEx02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 여러 번 입력
        System.out.print("아이디 : ");
        String id = sc.nextLine();
        System.out.print("비밀번호 : ");
        String password = sc.nextLine();

        System.out.println(id);
        System.out.println(password);

        sc.close();
    }
}
