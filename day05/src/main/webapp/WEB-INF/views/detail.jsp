<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Todo Detail Page</h1>
	<p>
	 	<c:out value="${todo}"/>
	</p>
	<h1>
		<c:out value="${todo.title}"/>
	</h1>
	<p>작성자 : <c:out value="${todo.writer }"/></p>
	<p>날짜 : <c:out value="${todo.todoDate }"/></p>
	<p>작성상황 : <c:out value="${todo.finished }"/></p>
</body>
</html>