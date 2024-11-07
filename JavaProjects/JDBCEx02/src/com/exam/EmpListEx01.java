package com.exam;

import java.sql.*;

public class EmpListEx01 {
    public static void main(String[] args) {

        String url = "jdbc:mariadb://localhost:3306/sample";
        String user = "root";
        String password = "!123456";

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName("org.mariadb.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("데이터베이스 연결 성공");

            stmt = conn.createStatement();

            String sql = "SELECT empno, ename, sal, hiredate FROM emp WHERE deptno = 10";
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String empno = rs.getString("empno");
                String ename = rs.getString("ename");
                String sal = rs.getString("sal");
                String hiredate = rs.getString("hiredate").replaceAll("-", "/");

                System.out.printf("%s %s %s %s%n", empno, ename, sal, hiredate);
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            System.out.println("[에러] : " + e.getMessage());
        } finally {
            if (rs != null) { try { rs.close(); } catch (SQLException e) {}}
            if (stmt != null) { try { stmt.close(); } catch (SQLException e) {}}
            if (conn != null) { try { conn.close(); } catch (SQLException e) {}}
        }

    }
}
