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
	<h1>NOTICE DETAIL</h1>
	<table>
		<tr>
			<td>${nt.n_no }</td>
			<td>${nt.n_title}</td>
			<td>${nt.n_id }</td>
		</tr>
		<tr>
			<td>${nt.n_content }</td>
		</tr>
		<tr>
			<td><img alt="X" src="resources/img/${nt.n_photo }"></td>
		</tr>
	</table>
	<c:if test="${loginMember.m_id eq 'hj'}">
	<button onclick="goUpdateNotice(${nt.n_no })">수정</button>
	<button onclick="goDelNotice(${nt.n_no })">삭제</button>
	</c:if>
</body>
</html>