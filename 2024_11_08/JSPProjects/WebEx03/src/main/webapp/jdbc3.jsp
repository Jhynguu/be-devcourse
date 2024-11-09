<%--
  Created by IntelliJ IDEA.
  User: kevin
  Date: 2024-11-08
  Time: 오후 12:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="javax.naming.Context" %>
<%@ page import="javax.naming.InitialContext" %>
<%@ page import="javax.naming.NamingException" %>

<%@ page import="javax.sql.DataSource" %>

<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.SQLException" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

<!-- jdbc1.jsp -->
<%
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    StringBuilder sbHtml = new StringBuilder();
    try {
        Context initCtx = new InitialContext();
        Context envCtx = (Context) initCtx.lookup("java:comp/env");
        DataSource dataSource = (DataSource) envCtx.lookup("jdbc/mariadb1");

        conn = dataSource.getConnection();

        String sql = "select deptno, dname, loc from dept";

        pstmt = conn.prepareStatement(sql);

        rs = pstmt.executeQuery();

        sbHtml.append("<table border='1' cellspacing='0'>");
        while (rs.next()) {
            sbHtml.append("<tr>");
            sbHtml.append("<td>" + rs.getString("deptno") + "</td>");
            sbHtml.append("<td>" + rs.getString("dname") + "</td>");
            sbHtml.append("<td>" + rs.getString("loc") + "</td>");
            sbHtml.append("</tr>");
        }
        sbHtml.append("</table>");

    } catch ( NamingException e ) {
        System.out.println( "[에러] " + e.getMessage() );
    } catch ( SQLException e ) {
        System.out.println( "[에러] " + e.getMessage() );
    } finally {
        if ( rs != null ) rs.close();
        if ( pstmt != null ) pstmt.close();
        if ( conn != null ) conn.close();
    }
%>

<%= sbHtml.toString() %>
</body>
</html>