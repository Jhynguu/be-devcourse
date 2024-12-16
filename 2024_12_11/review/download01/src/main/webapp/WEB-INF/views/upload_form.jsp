<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!doctype html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>파일 업로드</title>
</head>
<body>
<h1>파일 업로드 폼</h1>
<form action="upload_ok" method="post" enctype="multipart/form-data">
    <!-- 파일 선택 입력 -->
    <input type="file" name="upload">
    <!-- 업로드 버튼 -->
    <button>업로드</button>
</form>
</body>
</html>
