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

  // 드라이버 로딩
  Class.forName( "org.mariadb.jdbc.Driver" );
  out.println("드라이버 로딩 성공<br>");

  // 데이터베이스 연결
  conn = DriverManager.getConnection(url, user, password);
  out.println("드라이버 연결 성공<br>");

  conn.close();
%>
</body>
</html>
