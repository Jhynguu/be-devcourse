<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<!-- index1.jsp -->
<%
    int i = 10;
%>
Hello JSP 1 <br>
<jsp:include page="sub1.jsp">
    <jsp:param name="data1" value="20"/>
    <jsp:param name="data2" value="40"/>
</jsp:include>
<%
    out.println("i = " + i + "<br>");
%>
Hello JSP 4 <br>
<jsp:include page="sub2.jsp"></jsp:include>
Hello JSP 7 <br>
</body>
</html>
