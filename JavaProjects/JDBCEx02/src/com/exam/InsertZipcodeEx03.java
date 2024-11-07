package com.exam;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertZipcodeEx03 {
    public static void main(String[] args) {
        String url = "jdbc:mariadb://localhost:3306/sample";
        String user = "root";
        String password = "!123456";

        BufferedReader br = null;

        Connection conn = null;
        Statement stmt = null;

        try {
            Class.forName("org.mariadb.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);

            stmt = conn.createStatement();

            br = new BufferedReader(new FileReader("zipcode_seoul_utf8_type2.csv"));
            String line = "";
            while ((line = br.readLine()) != null) {
                // System.out.println(line);

                String[] addresses = line.split(",");
                String sql = String.format("insert into zipcode values ( '%s', '%s', '%s', '%s', '%s', '%s', %s)"
                        , addresses[0], addresses[1], addresses[2], addresses[3], addresses[4], addresses[5], addresses[6]);

                // System.out.println(sql);
                stmt.executeUpdate(sql);
            }

            System.out.println("복구 완료");
        } catch (IOException e) {
            System.out.println("[에러] : " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("[에러] : " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("[에러] : " + e.getMessage());
        } finally {
            if (br != null) { try { br.close(); } catch (IOException e) {}}
            if (stmt != null) { try { stmt.close(); } catch (SQLException e) {}}
            if (conn != null) { try { conn.close(); } catch (SQLException e) {}}
        }
    }
}
