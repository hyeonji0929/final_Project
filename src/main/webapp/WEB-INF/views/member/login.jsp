<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="member.login" method="post" onsubmit="return loginCheck();">
		<table>
			<tr>
				<td><input name="m_id" placeholder="ID"></td>
			</tr>
			<tr>
				<td><input name="m_pw" placeholder="PW"></td>
			</tr>
			<tr>
				<td>
					<button>로그인</button>
					<button type="button" onclick="joinGo()">회원가입</button>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>