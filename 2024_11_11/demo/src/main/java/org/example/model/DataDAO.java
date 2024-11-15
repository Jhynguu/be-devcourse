package org.example.model;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DataDAO {
    // 데이터베이스 연결용 beans
    private DataSource dataSource = null;

    public DataDAO() {
        try {
            Context initCtx = new InitialContext();
            Context envCtx = (Context) initCtx.lookup("java:comp/env");
            this.dataSource = (DataSource) envCtx.lookup("jdbc/mariadb1");
        } catch (NamingException e) {
            System.out.println("[에러] : " + e.getMessage());
        }
    }

    public StringBuilder selectList() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        StringBuilder sbResult = new StringBuilder();
        try {
            conn = dataSource.getConnection();

            String sql = "select seq, writer from board1";
            pstmt = conn.prepareStatement(sql);

            rs = pstmt.executeQuery();
            while (rs.next()) {
                // System.out.println(rs.getString("seq"));
                // System.out.println(rs.getString("writer"));

                sbResult.append(rs.getString("seq") + " : " + rs.getString("writer") + "<br>");

            }
        } catch (SQLException e) {
            System.out.println("[에러] : " + e.getMessage());
        } finally {
            if (rs != null) try { rs.close(); } catch (SQLException e) {}
            if (pstmt != null) try { pstmt.close(); } catch (SQLException e) {}
            if (conn != null) try { conn.close(); } catch (SQLException e) {}
        }
        return sbResult;
    }

    // DTO를 통해서 데이터 전송
    // ArrayList + TO => 데이터를 2차원배열로 가져올 수 있음
    // 문자열이 아니라 데이터를 객체화
    public ArrayList<DataTO> selectList2() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        ArrayList<DataTO> lists = new ArrayList<>();
        try {
            conn = dataSource.getConnection();

            String sql = "select seq, writer from board1";
            pstmt = conn.prepareStatement(sql);

            rs = pstmt.executeQuery();
            while (rs.next()) {
                DataTO to = new DataTO();
                to.setSeq(rs.getString("seq"));
                to.setWriter(rs.getString("writer"));

                lists.add(to);
            }
        } catch (SQLException e) {
            System.out.println("[에러] : " + e.getMessage());
        } finally {
            if (rs != null) try { rs.close(); } catch (SQLException e) {}
            if (pstmt != null) try { pstmt.close(); } catch (SQLException e) {}
            if (conn != null) try { conn.close(); } catch (SQLException e) {}
        }
        return lists;
    }
}
