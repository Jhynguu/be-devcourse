<%--
  Created by IntelliJ IDEA.
  User: jhyngu
  Date: 2024-11-08
  Time: 오전 10:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.SQLException" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

Hello JDBC<br>

<%
  // 연결 정보
  String url = "jdbc:mariadb://localhost:3306/sample";
  String user = "root";
  String password = "!123456";

  Connection conn = null;

  try {
    // 드라이버 로딩
    Class.forName( "org.mariadb.jdbc.Driv" );
    out.println("드라이버 로딩 성공<br>");

    // 데이터베이스 연결
    conn = DriverManager.getConnection(url, user, password);
    out.println("드라이버 연결 성공<br>");
  } catch (ClassNotFoundException e) {
    System.out.println("[에러]" + e.getMessage());
  } catch (SQLException e) {
  System.out.println("[에러]" + e.getMessage());
  } finally {
    if ( conn != null ) conn.close();
  }

%>
</body>
</html>
