<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.example.zipcode.model.ZipcodeTO" %>
<%@ page import="java.util.ArrayList" %>
<%
    ArrayList<ZipcodeTO> lists = (ArrayList<ZipcodeTO>) request.getAttribute( "lists" );

    StringBuilder sbHtml = new StringBuilder();
    sbHtml.append( "<table border='1' cellspacing='0' width='800'>" );
    for ( ZipcodeTO to : lists ) {
        sbHtml.append( "<tr border='1' cellspacing='0'>" );
        sbHtml.append( "    <td>" + to.getZipcode()+ "</td>" );
        sbHtml.append( "    <td>" + to.getSido() + "</td>" );
        sbHtml.append( "    <td>" + to.getGugun() + "</td>" );
        sbHtml.append( "    <td>" + to.getDong() + "</td>" );
        sbHtml.append( "    <td>" + to.getRi() + "</td>" );
        sbHtml.append( "    <td>" + to.getBunji() + "</td>" );
        sbHtml.append( "</tr>");
    }
    sbHtml.append( "</table>" );
%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>

결과 :
<hr />
<%=sbHtml.toString() %>

</body>
</html>