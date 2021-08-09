<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>NOTICE</h1>
	<a href="notice.reg.go">글쓰기</a>
	<table>
		<tr>
			<th>글번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>작성일</th>
		</tr>
		<c:forEach var="list" items="${notices }">
			<tr>
				<td><a href="notice.detail'">${list.n_no }</a></td>
				<td>${list.n_title }</td>
				<td>${list.n_id }</td>
				<td><fmt:formatDate value="${list.n_date }" type="date" dateStyle="short" /></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>