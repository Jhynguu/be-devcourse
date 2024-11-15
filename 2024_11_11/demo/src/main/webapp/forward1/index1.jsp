<%--
  Created by IntelliJ IDEA.
  User: jhyngu
  Date: 2024-11-11
  Time: 오후 2:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<!-- index1.jsp -->
Hello JSP 1 <br>
<jsp:forward page="sub1.jsp">
  <jsp:param name="data1" value="10"/>
  <jsp:param name="data2" value="20"/>
</jsp:forward>
Hello JSP 2 <br>
Hello JSP 3 <br>
</body>
</html>
