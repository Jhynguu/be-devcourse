<%--
  Created by IntelliJ IDEA.
  User: jhyngu
  Date: 2024-11-11
  Time: 오후 3:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="org.example.model.DataDAO" %>
<%@ page import="org.example.model.DataTO" %>
<%@ page import="java.util.ArrayList" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    // 데이터베이스 풀링 얻어오기
    DataDAO dao = new DataDAO();

    ArrayList<DataTO> lists = dao.selectList2();
    for (DataTO to : lists) {
        out.println(to.getSeq() + " : " + to.getWriter() + "<br>");
    }
%>
</body>
</html>