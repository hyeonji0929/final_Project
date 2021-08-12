<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>STORY DETAIL</h1>
<form action="story.update.do" method="post" enctype="multipart/form-data">
	<table>
		<tr>
			<td><input name="s_title" value="${st.s_title}"></td>
		</tr>
		<tr>
			<td><input name="s_no" type="hidden" value="${st.s_no }"></td>
		</tr>
		<tr>
			<td><input name="s_content" value="${st.s_content }"></td>
		</tr>
		<tr>
			<td><img alt="X" src="resources/img/${st.s_photo }"></td>
		</tr>
		
		<tr>
			<td><input type="file" name="s_photo"></td>
		</tr>
		<tr>
		<td>
		<button>수정 완료</button>
		</td>
		</tr>
	</table>
</form>
</body>
</html>