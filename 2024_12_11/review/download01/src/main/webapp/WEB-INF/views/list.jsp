<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!doctype html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>업로드 목록</title>
</head>
<body>
<h1>업로드된 파일 목록</h1>

<%
    // 모델에서 전달된 업로드된 파일 이름 가져오기
    String file = (String) request.getAttribute("file");
%>
<ul>
    <!-- 업로드된 파일을 다운로드 링크로 표시 -->
    <li><a href='download?file=<%=file%>' ><%=file%></a></li>
</ul>

</body>
</html>
