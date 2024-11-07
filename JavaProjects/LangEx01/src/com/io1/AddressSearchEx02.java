package com.io1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AddressSearchEx02 {
    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

        try {
            String line;
            System.out.println("동 이름 입력 (종료하려면 'exit' 입력):");

            while (true) {
                String input = userInput.readLine();

                if (input.equalsIgnoreCase("exit")) {
                    break;
                }

                if (input.length() < 1) {
                    System.out.println("한 글자 이상 입력하시오.");
                    continue;
                }

                br = new BufferedReader(new FileReader("c:/java/zipcode_seoul_utf8_type2.csv"));
                boolean found = false;

                while ((line = br.readLine()) != null) {
                    String[] data = line.split(",");
                    if (data.length > 3 && data[3].startsWith(input)) {
                        System.out.println("우편번호 : " + data[0] + ", 시도 : " + data[1] + ", 구군 : " + data[2] +
                                ", 동 : " + data[3] + ", 건물 이름 : " + data[4] + ", 번호 : " + data[5] +
                                ", 번지 : " + data[6]);
                        found = true;
                    }
                }

                if (!found) {
                    System.out.println("해당 동을 찾을 수 없습니다.");
                }

                br.close();
                System.out.println("동 이름 입력 (종료하려면 'exit' 입력):");
            }
        } catch (IOException e) {
            System.out.println("[에러] " + e.getMessage());
        } finally {
            try {
                if (br != null) br.close();
                userInput.close();
            } catch (IOException e) {
                System.out.println("[에러] " + e.getMessage());
            }
        }
    }
}
