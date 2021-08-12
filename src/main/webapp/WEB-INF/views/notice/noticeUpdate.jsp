<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>NOTICE UPDATE</h1>
<form action="notice.update.do" method="post" enctype="multipart/form-data">
	<table>
		<tr>
			<td><input name="n_no" type="hidden" value="${nt.n_no }"></td>
		</tr>
 		<tr>
			<td><input name="n_title" value="${nt.n_title }"></td>
		</tr>
		<tr>
			<td><input name="n_content"  value="${nt.n_content }"></input></td>
		</tr>
		<tr>
			<td><img alt="X" src="resources/img/${nt.n_photo }"></td>
		</tr>

		<tr>
			<td><input type="file" name="n_photo"></td>
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