<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>글쓰기</h1>
<form action="notice.reg.do" method="post" enctype="multipart/form-data">
	<table>
		<tr>
			<td>제목</td>
			<td><input name="n_title"></td>
		</tr>
		<tr>
			<td>내용</td>
			<td><textarea name="n_content"></textarea></td>
		</tr>
		<tr>
			<td>사진</td>
			<td><input type="file" name="n_photo"></td>
		</tr>
		<tr>
			<td><button>등록</button></td>
		</tr>
	</table>	
</form>
</body>
</html>