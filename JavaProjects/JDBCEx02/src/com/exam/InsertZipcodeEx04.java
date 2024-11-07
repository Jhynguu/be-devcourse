package com.exam;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;

public class InsertZipcodeEx04 {
    public static void main(String[] args) {
        String url = "jdbc:mariadb://localhost:3306/sample";
        String user = "root";
        String password = "!123456";

        BufferedReader br = null;
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            Class.forName("org.mariadb.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);

            String sql = "insert into zipcode values (?, ?, ?, ?, ?, ?, ?)";
            pstmt = conn.prepareStatement(sql);

            br = new BufferedReader(new FileReader("zipcode_seoul_utf8_type2.csv"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] addresses = line.split(",");

                for (int i = 0; i < addresses.length; i++) {
                    pstmt.setString(i + 1, addresses[i]);
                }

                pstmt.executeUpdate();
            }
        } catch (IOException e) {
            System.out.println("[에러] : " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("[에러] : " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("[에러] : " + e.getMessage());
        } finally {
            if (br != null) { try { br.close(); } catch (IOException e) {}}
            if (pstmt != null) { try { pstmt.close(); } catch (SQLException e) {}}
            if (conn != null) { try { conn.close(); } catch (SQLException e) {}}
        }
    }
}
