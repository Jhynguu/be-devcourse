<%--
  Created by IntelliJ IDEA.
  User: jhyngu
  Date: 2024-11-13
  Time: 오전 11:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="org.example.model1.ZipcodeTo" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="org.example.model1.ZipcodeDAO" %>

<%
  ArrayList<ZipcodeTo> lists = (ArrayList<ZipcodeTo>) request.getAttribute("lists");

  StringBuilder sbHtml = new StringBuilder();

  sbHtml.append("<table border='1' cellspacing='0' width='800'>");
  for (ZipcodeTo to : lists) {
    sbHtml.append("<tr>");
    sbHtml.append("<td>" + to.getZipcode() + "</td>");
    sbHtml.append("<td>" + to.getSido() + "</td>");
    sbHtml.append("<td>" + to.getGugun() + "</td>");
    sbHtml.append("<td>" + to.getDong() + "</td>");
    sbHtml.append("<td>" + to.getRi() + "</td>");
    sbHtml.append("<td>" + to.getBunji() + "</td>");
    sbHtml.append("</tr>");
  }
  sbHtml.append("</table>");
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
zipcode_ok.jsp
<br><br>
<%= sbHtml.toString()%>

</body>
</html>
