<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    // form.jsp
%>
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

<form action="form_ok.do" method="get">
    데이터 <input type="text" name="data">
    <input type="submit" value="get 방식 전송">
</form>

<br>

<form action="form_ok.do" method="post">
    데이터 <input type="text" name="data">
    <input type="submit" value="post 방식 전송">
</form>

</body>
</html>