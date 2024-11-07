<%--
  Created by IntelliJ IDEA.
  User: jhyngu
  Date: 2024-11-07
  Time: 오후 2:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--form03.jsp--%>
<%--사용자 입력--%>
<form action="form03_ok.jsp" method="post">
  <input type="radio" name="cb" value="사과">사과<br>
  <input type="radio" name="cb" value="수박" checked>수박<br>
  <input type="radio" name="cb" value="딸기">딸기<br>
  <input type="radio" name="cb" value="참외">참외<br>

  <br>

  <select name="sel">
    <option value="사과">사과</option>
    <option value="수박">수박</option>
    <option value="딸기">딸기</option>
    <option value="참외">참외</option>
  </select>

  <br> <br>

  <input type="color" name="color" value="#ff00ff">

  <input type="submit" value="전송"/>
</form>

</body>
</html>
