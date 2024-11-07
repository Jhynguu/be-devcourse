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
<%--form01.jsp--%>
<%--사용자 입력--%>
<form action="form01_ok.jsp" method="get">
  데이터1 <input type="text" name="data1"/>
  데이터2 <input type="text" name="data2"/>
  <input type="submit" value="전송"/>
</form>

<form action="form01_ok.jsp" method="get">
  데이터1 <input type="text" name="data1"/>
  데이터2 <input type="text" name="data2"/>
  <input type="submit" value="전송"/>

</form>
<br/>
<a href="./form01_ok.jsp?data1=값&data2=값2">전송</a>
</body>
</html>
