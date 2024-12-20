<%--
  Created by IntelliJ IDEA.
  User: kevin
  Date: 2024-11-08
  Time: 오후 3:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ page import="org.example.model1.BoardTO" %>
<%@ page import="org.example.model1.BoardDAO" %>

<%
    BoardTO to = new BoardTO();
    to.setSeq( request.getParameter( "seq" ) );
    to.setSubject( request.getParameter( "subject" ) );
    to.setMail( request.getParameter( "mail1" ) + "@" + request.getParameter( "mail2" ) );
    to.setPassword( request.getParameter( "password" ) );
    to.setContent( request.getParameter( "content" ) );

    BoardDAO dao = new BoardDAO();
    int flag = dao.boardModifyOk( to );

    String seq = to.getSeq();

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
