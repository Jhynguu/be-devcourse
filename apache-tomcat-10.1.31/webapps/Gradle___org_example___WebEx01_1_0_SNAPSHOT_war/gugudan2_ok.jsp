<%--
  Created by IntelliJ IDEA.
  User: jhyngu
  Date: 2024-11-07
  Time: 오후 2:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String strDan = request.getParameter( "dan" );
    int iDan = Integer.parseInt( strDan );

    StringBuilder sbHtml = new StringBuilder();
    sbHtml.append( "<table border='1' cellspacing='0'>" );
    sbHtml.append( "<tr>" );
    for( int i=1 ; i<= 9 ; i++ ) {
        sbHtml.append( "<td>" + iDan + " X " + i + " = " + (iDan * i) + "</td>" );
    }
    sbHtml.append( "</tr>" );
    sbHtml.append( "</table>" );
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<!-- gugudan2_ok.jsp -->
<%= sbHtml.toString() %>

</body>
</html>
