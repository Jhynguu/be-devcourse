package com.io1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOEx21 {
    public static void main(String[] args) {

        BufferedReader br = null;

        br = new BufferedReader(new InputStreamReader(System.in));

        try {
            while (true) {
                System.out.println("입력 : ");
                String data = br.readLine();
                if (data.equals("exit")) {
                    break;
                }
                System.out.println("입력 데이터 : " + data);
            }
            System.out.println("프로그램 종료");
        } catch (IOException e) {
            System.out.println("[에러]" + e.getMessage());
        } finally {
            if (br != null) { try { br.close(); } catch (IOException e) {}}
        }

    }
}
