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
<h1>STORY</h1>
<a href="story.reg.go">글쓰기</a>
	<table>
		<c:forEach var="list" items="${stories }">
			<tr>
				<td>${list.s_no }</td>
				<td><a href="story.detail?s_no=${list.s_no}">${list.s_title }</a></td>
				<td><img alt="X" src="resources/img/${list.s_photo }"></td>
				<td><fmt:formatDate value="${list.s_date }" type="date" dateStyle="short"/></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>