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
<%
    out.println( "<script type='text/javascript'>" );
    int flag = (Integer)request.getAttribute( "flag" );
    if ( flag == 0 ) {
        out.println( "alert('로그인되었습니다.');");
        out.println( "location.href='./login_complete';");
    } else if ( flag == 1 ) {
        out.println( "alert('아이디 비밀번호 오류');");
        out.println( "history.back();");
    } else {
        out.println( "alert('시스템 오류');");
        out.println( "history.back();");
    }
    out.println( "</script>" );
%>
</body>
</html>