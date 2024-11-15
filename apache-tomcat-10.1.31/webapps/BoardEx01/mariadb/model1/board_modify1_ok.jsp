<%--
  Created by IntelliJ IDEA.
  User: jhyngu
  Date: 2024-11-08
  Time: 오후 3:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="org.example.model.BoardTO" %>
<%@ page import="org.example.model.BoardDAO" %>

<%
    BoardTO to = new BoardTO();
    to.setSeq(request.getParameter("seq"));       // 게시글 번호
    to.setSubject(request.getParameter("subject")); // 제목
    to.setMail(request.getParameter("mail1") + "@" + request.getParameter("mail2"));       // 이메일
    to.setPassword(request.getParameter("password")); // 비밀번호
    to.setContent(request.getParameter("content")); // 내용

    BoardDAO dao = new BoardDAO();
    int flag = dao.boardModifyOk(to);

    String seq = to.getSeq();

    // 에러 중심의 후처리 = 자바스크립트 중심으로 처리
    out.println( "<script type='text/javascript'>" );
    if ( flag == 0 ) {
        // 정상
        out.println("alert( '글수정 성공' );");
        out.println("location.href='./board_view1.jsp?seq=" + seq + "';");
    } else if ( flag == 1 ) {
        out.println( "alert( '비밀번호 오류' );" );
        out.println( "history.back();" );
    } else {
        // 비정상
        out.println( "alert( '글수정 실패' );" );
        out.println( "history.back();" );
    }
    out.println( "</script>" );
%>
<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>
