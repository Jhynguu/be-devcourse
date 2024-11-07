<%--
  Created by IntelliJ IDEA.
  User: jhyngu
  Date: 2024-11-07
  Time: 오후 2:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>구구단 범위 설정</title>
  <script type="text/javascript">
    // 폼 입력값을 확인하는 함수
    const checkFrm = function() {
      if (document.frm.startDan.value == '') { // 시작단 입력 확인
        alert('시작단을 입력하세요'); // 시작단이 비어 있으면 경고 메시지
        return false;
      }
      if (document.frm.endDan.value == '') { // 끝단 입력 확인
        alert('끝단을 입력하세요'); // 끝단이 비어 있으면 경고 메시지
        return false;
      }
      document.frm.submit(); // 입력이 정상적이면 폼 제출
    }
  </script>
</head>
<body>
<%--  gugudan1.jsp  --%>
<form action="./gugudan1_ok.jsp" method="post" name="frm">
  시작단 : <input type="text" name="startDan" maxlength="2" placeholder="시작단 입력"> <!-- 시작단 입력 필드 -->
  ~ 끝단 : <input type="text" name="endDan" maxlength="2" placeholder="끝단 입력"> <!-- 끝단 입력 필드 -->
  <input type="button" value="구구단 출력" onclick="checkFrm()"> <!-- 버튼 클릭 시 checkFrm 함수 호출 -->
</form>
</body>
</html>