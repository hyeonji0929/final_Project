<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>INDEX</h1> ${r }
	<table>
		<tr>
			<td><a href="notice.go">공지사항</a></td>
		</tr>
	</table>
	<table id="loginArea">
		<tr>
			<td><jsp:include page="${loginPage }"></jsp:include></td>
		</tr>
	</table>
	<table>
		<tr>
			<td><jsp:include page="${contentPage }"></jsp:include></td>
		</tr>
	</table>
</body>
</html>