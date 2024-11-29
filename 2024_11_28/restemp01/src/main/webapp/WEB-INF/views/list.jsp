<%@ page import="com.example.restemp.dto.EmpTO" %>
<%@ page import="java.util.ArrayList" %>
<%
    ArrayList<EmpTO> lists = (ArrayList<EmpTO>) request.getAttribute("lists");

    StringBuilder sbHtml = new StringBuilder();

    sbHtml.append("<table border='1' cellspacing='0'>");

    for (EmpTO to : lists) {
        sbHtml.append("<tr>");
        sbHtml.append("<td>" + to.getEmpno() + "</td>");
        sbHtml.append("<td>" + to.getEname() + "</td>");
        sbHtml.append("<td>" + to.getJob() + "</td>");
        sbHtml.append("</tr>");
    }
    sbHtml.append("</table>");
%>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
list.jsp
<%=sbHtml.toString()%>
</body>
</html>