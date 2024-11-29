<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    //out.println("flag : " + (Integer) request.getAttribute("flag"));
    int flag = (Integer) request.getAttribute("flag");
    if (flag != 0) {
        // 로그인을 하지 않아서 쿠키가 없는 경우
        out.println("<script type='text/javascript'>");
        out.println("alert('로그인 해야합니다.');");
        out.println("location.href='./login_form'; ");
        out.println("</script>");
    } else {
        // 정상 로그인의 경우
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
login_complete.jsp
<br><br>
<a href="./logout_ok">로그아웃</a>
</body>
</html>
<%
    }
%>