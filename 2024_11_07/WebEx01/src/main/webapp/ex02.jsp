<%--
  Created by IntelliJ IDEA.
  User: jhyngu
  Date: 2024-11-07
  Time: 오후 12:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%!
  public int multiply(int a, int b) {
    int result = a + b;
    return result;
  }
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
  int a = 10;
  int b = 20;
  int result = multiply(a, b);
  out.println("결과 : " + result + "<br>");
%>

10 + 25 = <%= multiply(10, 25)%>

</body>
</html>
