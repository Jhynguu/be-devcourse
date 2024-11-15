<%--
  Created by IntelliJ IDEA.
  User: jhyngu
  Date: 2024-11-11
  Time: 오후 2:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

Hello JSP 4 <br>
Hello JSP 5 <br>
<%
  String data1 = request.getParameter("data1");
  String data1 = request.getParameter("data2");
  out.println("data1 = " + data1);
  out.println("data2 = " + data2);
%>
</body>
</html>
