package com.exam;

import java.sql.*;

public class EmpListEx02 {
    public static void main(String[] args) {

        String url = "jdbc:mariadb://localhost:3306/sample";
        String user = "root";
        String password = "!123456";

        Connection conn = null;
        Statement stmt1 = null;
        Statement stmt2 = null;
        ResultSet rs = null;

        try {
            Class.forName("org.mariadb.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);

            // emp10 테이블 생성
            stmt1 = conn.createStatement();
            String createTableSql = "create table if not exists emp10 as select * from emp where 1 = 0 ";
            stmt1.execute(createTableSql);
            System.out.println("테이블 생성 완료");

            // 10번 부서의 데이터 복사
            stmt2 = conn.createStatement();
            String insertDataSql = "insert into emp10 select * from emp where deptno = 10";
            stmt2.executeUpdate(insertDataSql);
            System.out.println("데이터 복사 완료");

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            System.out.println("[에러] : " + e.getMessage());
        } finally {
            if (stmt2 != null) { try { stmt2.close(); } catch (SQLException e) {}}
            if (stmt1 != null) { try { stmt1.close(); } catch (SQLException e) {}}
            if (conn != null) { try { conn.close(); } catch (SQLException e) {}}
        }

    }
}
