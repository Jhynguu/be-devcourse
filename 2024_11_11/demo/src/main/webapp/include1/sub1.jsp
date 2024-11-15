<%--
  Created by IntelliJ IDEA.
  User: jhyngu
  Date: 2024-11-11
  Time: 오후 2:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- sub1.jsp -->
Hello JSP 2 <br>
Hello JSP 3 <br>
<%
  String data1 = request.getParameter("data1");
  String data2 = request.getParameter("data2");

  out.println("data1 = " + data1 + "<br>");
  out.println("data2 = " + data2 + "<br>");
%>
</body>