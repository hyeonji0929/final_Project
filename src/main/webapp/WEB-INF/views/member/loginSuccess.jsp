<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td><img
				src='resources/img/${sessionScope.loginMember.m_photo}' width="100px"></td>
			<td>${sessionScope.loginMember.m_id}<br>
				${sessionScope.loginMember.m_name }님
			</td>
		</tr>
		<tr>
			<td>
				<button onclick="memberInfoGo()">회원정보</button>
			</td>
			<td>
				<button><a href="member.logout">로그아웃</a></button>
			</td>
		</tr>
	</table>
</body>
</html>