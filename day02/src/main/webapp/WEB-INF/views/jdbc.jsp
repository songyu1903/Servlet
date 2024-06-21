<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/day02/jdbc-result" method="post">
		<input type="text" name="loginId" placeholder="아이디 입력"> <br>
		<input type="password" name="password" placeholder="비밀번호 입력"> <br>
		성별 선택 <br>
		남자 <input type="radio" name="gender" value="M"> <br>
		여자 <input type="radio" name="gender" value="F"> <br>
		<button>회원가입</button>
	</form>
</body>
</html>