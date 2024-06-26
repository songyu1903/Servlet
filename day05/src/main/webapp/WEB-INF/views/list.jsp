<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 이게 있어야 jstl을 사용할 수 있다. -->
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Todo List Page</h1>

	<c:out value="${todoList}"/>
	
	<table border="1px">
		<tr>
			<th>Title</th>
			<th>작성자</th>
			<th>날짜</th>
			<th>finished</th>
		</tr>
		
		<c:forEach var="dto" items="${todoList}">
		<tr>
			<td>
			 	<a href="/detail.td=${dto.todoId}">
					<c:out value="${dto.title}"/>
			 	</a>
			</td>
			<td>
				<c:out value="${dto.writer}"/>
			</td>
			<td>
				<c:out value="${dto.todoDate}"/>
			</td>
			<td>
				<c:out value="${dto.finished}"/>
			</td>
		</tr>
		</c:forEach>
		
	</table>
</body>
</html>