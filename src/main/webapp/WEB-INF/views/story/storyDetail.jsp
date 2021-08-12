<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>STORY DETAIL</h1>
	<table>
		<tr>
			<td>${st.s_no }</td>
			<td>${st.s_title}</td>
			<td>${st.s_id }</td>
		</tr>
		<tr>
			<td>${st.s_content }</td>
		</tr>
		<tr>
			<td><img alt="X" src="resources/img/${st.s_photo }"></td>
		</tr>
	</table>
	<button onclick="goUpdateStory(${st.s_no })">수정</button>
	<button onclick="goDelStory(${st.s_no })">삭제</button>
</body>
</html>