<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>
	<h1>회원가입</h1>
	<form action="/day03/join" method="post">
		아이디 : <input type="text" name="loginId"> <br>
		비밀번호 : <input type="password" name="password"> <br>
		이름 : <input type="text" name="name"> <br>
		나이 : <input type="text" name="age"> <br>
		<button>회원가입</button>
	</form>
</body>
</html>