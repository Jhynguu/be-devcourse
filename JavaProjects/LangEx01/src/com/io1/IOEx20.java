package com.io1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class IOEx20 {
    public static void main(String[] args) {
        // 다국어(유니코드) 처리

        // 가속화
        BufferedReader br = null;
        // InputStreamReader isr = null;

        try {
            // isr = new InputStreamReader(System.in);
            br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("입력 : ");

            /*
            int data = br.read();
            System.out.println("입력값 : " + (char)data);
            data = br.read();
            System.out.println("입력값 : " + (char)data);
            data = br.read();
            System.out.println("입력값 : " + (char)data);
            */

            String line = br.readLine();
            System.out.println("입력값 : " + line);

        } catch (IOException e) {
            System.out.println("[에러]" + e.getMessage());
        } finally {
            if (br != null) { try { br.close(); } catch (IOException e) {}}
        }
    }
}
