<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>
upload_ok.jsp
<br /><br />
<%
    String imagename = (String) request.getAttribute("imagename");
%>
<%=imagename%><br>
<%--
    이미지 안보임
    url 통해서 보게 되면 - 톰캣이 리로드 될까지 이미지가 보이지 않음
    <img src="/upload/<%=imagename%>"/><br>
--%>
<img src="/image/<%=imagename%>"/><br>

</body>
</html>