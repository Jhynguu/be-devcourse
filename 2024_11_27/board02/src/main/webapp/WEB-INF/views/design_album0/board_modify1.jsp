﻿<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width,initial-scale=1.0,minimum-scale=1.0,maximum-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="./css/board_write.css">
</head>

<body>
<!-- 상단 디자인 -->
<div class="contents1"> 
	<div class="con_title"> 
		<p style="margin: 0px; text-align: right">
			<img style="vertical-align: middle" alt="" src="./images/home_icon.gif" /> &gt; 커뮤니티 &gt; <strong>여행지리뷰</strong>
		</p>
	</div> 

	<form action="" method="post" name="">
		<div class="contents_sub">
		<!--게시판-->
			<div class="board_write">
				<table>
				<tr>
					<th class="top">글쓴이</th>
					<td class="top" colspan="3"><input type="text" name="writer" value="" class="board_view_input_mail" maxlength="5" /></td>
				</tr>
				<tr>
					<th>제목</th>
					<td colspan="3"><input type="text" name="subject" value="" class="board_view_input" /></td>
				</tr>
				<tr>
					<th>비밀번호</th>
					<td colspan="3"><input type="password" name="password" value="" class="board_view_input_mail"/></td>
				</tr>
				<tr>
					<th>내용</th>
					<td colspan="3">
						<textarea name="content" class="board_editor_area"></textarea>
					</td>
				</tr>
				<tr>
					<th>이미지</th>
					<td colspan="3">
						기존 이미지 : <br /><br />
						<input type="file" name="upload" value="" /><br /><br />
					</td>
				</tr>
				<tr>
					<th>이메일</th>
					<td colspan="3"><input type="text" name="mail1" value="" class="board_view_input_mail"/> @ <input type="text" name="mail2" value="" class="board_view_input_mail"/></td>
				</tr>
				</table>
			</div>

			<div class="btn_area">
				<div class="align_left">			
					<input type="button" value="목록" class="btn_list btn_txt02" style="cursor: pointer;" onclick="location.href='list.do'" />
					<input type="button" value="보가" class="btn_list btn_txt02" style="cursor: pointer;" onclick="location.href='view.do'" />
				</div>
				<div class="align_right">			
					<input type="button" value="수정" class="btn_write btn_txt01" style="cursor: pointer;" />
				</div>	
			</div>	
			<!--//게시판-->
		</div>
	</form>
</div>
<!-- 하단 디자인 -->

</body>
</html>
