package com.exam;

import java.sql.*;

public class PreparedStatementEx03 {
    public static void main(String[] args) {
        System.out.println("시작");

        String url = "jdbc:mariadb://localhost:3306/sample";
        String user = "root";
        String password = "!123456";

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            Class.forName("org.mariadb.jdbc.Driver");
            System.out.println("드라이버 로딩 성공");

            conn = DriverManager.getConnection(url, user, password);
            System.out.println("데이터베이스 연결 성공");

            // String sql = "select * from dept2";
            // String sql = "select * from dept2 where deptno = ?";
            // 영으로 시작하는 부서명 출력 - like
            String sql = "select * from dept2 where dname like ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "영%");

            rs = pstmt.executeQuery();

            while (rs.next()) {
                String deptno = rs.getString("deptno");
                String dname = rs.getString("dname");
                String loc = rs.getString("loc");
                System.out.println(deptno + "\t" + dname + "\t" + loc);
            }

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
