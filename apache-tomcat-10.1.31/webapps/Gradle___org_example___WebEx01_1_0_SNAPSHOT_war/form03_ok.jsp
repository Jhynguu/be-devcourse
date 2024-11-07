<%@ page import="java.util.Arrays" %><%--
  Created by IntelliJ IDEA.
  User: jhyngu
  Date: 2024-11-07
  Time: 오후 3:17
  To change this template use File | Settings | File Templates.
--%>
<%-- form03_ok.jsp --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    // 단일 라디오 버튼 확인
    String rb = request.getParameter("rb");
    out.println("라디오 버튼 : " + rb + "<br />");

    // 선택 옵션 확인
    String sel = request.getParameter("sel");
    out.println("옵션 : " + sel + "<br />");

    // 색상 선택 확인
    String color = request.getParameter("color");
    out.println("색상 : " + color + "<br />");
%>
</body>
</html>
