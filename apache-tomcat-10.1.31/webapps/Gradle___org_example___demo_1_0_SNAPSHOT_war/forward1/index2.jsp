<%--
  Created by IntelliJ IDEA.
  User: jhyngu
  Date: 2024-11-11
  Time: 오후 2:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
  // 실행 방법
  // forward1/index2.jsp?action=a
  // forward1/index2.jsp?action=b

  String action = request.getParameter("action");

  if (action.equals("a")) {
%>
<jsp:forward page="a.jsp" />
<%
  } else {
%>
<jsp:forward page="b.jsp"/>
<%
  }
%>
</body>
</html>
