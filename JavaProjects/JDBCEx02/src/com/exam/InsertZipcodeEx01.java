package com.exam;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InsertZipcodeEx01 {
    public static void main(String[] args) {

        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader("zipcode_seoul_utf8_type2.csv"));
            String line = "";
            while ((line = br.readLine()) != null) {
                // System.out.println(line);
                String[] addresses = line.split(",");
                String sql = String.format("insert into zipcode values ( '%s', '%s', '%s', '%s', '%s', '%s', %s)"
                , addresses[0], addresses[1], addresses[2], addresses[3], addresses[4], addresses[5], addresses[6]);

                System.out.println(sql);
            }
        } catch (IOException e) {
            System.out.println("[에러] : " + e.getMessage());
        } finally {
            if (br != null) { try { br.close(); } catch (IOException e) {}}
        }
    }
}
