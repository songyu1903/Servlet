# 서버
1. 하드웨어
	-서버 역할을 수행하는 물리적인 컴퓨터
2. 소프트웨어
	-클라이언트의 HTTP요청을 받고 응답을 보내줄 수 있는 프로그램

# 서버 소프트웨어의 종류
	1. 웹 서버 (Web Server , WS)
	- 클라이언트의 HTTP요청을 받고 응답을 보낸다.
	- 정적인 컨텐츠(HTML, CSS, JS, 이미지 등)를 제공하는 역할을 한다.
	- 자바에서 사용하는 WS는 대표적으로 Apache가 있다.


	2. 웹 어플리케이션 서버 (Web Application Server , WAS)
	- 클라이언트의 HTTP요청을 받고 응답을 보낸다.
	- 동적 웹 어플리케이션을 실행 시켜 동적인 컨텐츠를 생성해 제공하는 역할을 한다.
	- 정적 컨텐츠도 처리 가능하지만 WS에 비해 성능이 떨어진다.
	- 동적 컨텐츠를 처리하기 위해 여러 연산 및 DB접근을 수행한다.
	- 자바에서 사용하는 WAS는 대표적으로 Tomcat이 있다.

# 아파치 톰캣
	- WAS로 분류된지만 WS도 포함하고 있다

# HTTP 요청 예시

GET /submit-form HTTP/1.1
Host: www.example.com
Content-Type: application/json
Content-Length: 33
Accept-Encoding: gzip, deflate
Connection: keep-alive
{

  "name": "John",
  "age": 30
}

# HTTP 응답 예시
HTTP/1.1 200 OK
Content-Type: application/json
Content-Length: 27

{
  "status": "success"
}
