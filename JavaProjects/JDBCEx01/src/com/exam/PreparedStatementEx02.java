package com.exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementEx02 {
    public static void main(String[] args) {
        System.out.println("시작");

        String url = "jdbc:mariadb://localhost:3306/sample";
        String user = "root";
        String password = "!123456";

        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            Class.forName("org.mariadb.jdbc.Driver");
            System.out.println("드라이버 로딩 성공");

            conn = DriverManager.getConnection(url, user, password);
            System.out.println("데이터베이스 연결 성공");

            String sql = "update dept2 set loc=? where deptno=?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "광주");
            pstmt.setString(2, "61");

            int result = pstmt.executeUpdate();

            System.out.println("쿼리 실행 성공");

        } catch (SQLException e) {
            System.out.println("[에러]"+e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("[에러]" + e.getMessage());
        } finally {
            if (pstmt != null) { try { pstmt.close(); } catch (SQLException e) {}}
            if (conn != null) { try { conn.close(); } catch (SQLException e) {}}
        }
        System.out.println("끝");

    }
}
