<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Todo Register Page</h1>
	<form action="/register" method="post">
		작성자 : <input type="text" name="writer"> <br>
		할 일 : <input type="text" name="title"> <br>
		날짜 : <input type="date" name="todoDate"> <br>
		<!-- button 은 기본 타입이 submit -->
		<button>등록</button>
	</form>
</body>
</html>