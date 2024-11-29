<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
list.jsp
<br><br>
<%
    String file = (String)request.getAttribute("file");
%>
업로드 목록
<ul>
    <li><a href="download?file=<%=file%>"><%=file%></a></li>
</ul>
</body>
</html>