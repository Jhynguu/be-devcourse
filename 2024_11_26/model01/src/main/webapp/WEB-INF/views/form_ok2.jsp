<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.example.model.dto.FormTO" %>
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
form_ok.jsp
<br>
<%
    FormTO to = (FormTO)request.getAttribute("to");
    out.println("userid : " + (String) request.getAttribute("userid") + "<br>");
    out.println("userpw : " + (String) request.getAttribute("userpw") + "<br>");
%>
</body>
</html>