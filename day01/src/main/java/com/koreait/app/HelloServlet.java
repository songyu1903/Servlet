package com.koreait.app;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// @WebServlet 어노테이션은 우리가 지정한 path(경로)로 요청이 들어왔을 때
// 이 서블릿이 실행되도록 설정해준다.
@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
//  이 서블릿 클래스와 연결된 경로로 요청이 들어왔을 때
//	요청 방식이 get | post 둘 중 하나가 둘어오게 된다.
//	get방식으로 요청이 들어오면 doGet() 메서드가 실행된다.
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		doGet 메서드의 파라미터를 확인해보면 request(요청) response(응답) 이 선언되어있다.
//		자바에서는 요청과 응답을 객체로 다루며, 사용자가 보낸 요청에서 필요한 정보를 꺼낼때 
//		request 객체에서 꺼낼 수 있다.
//		사용자(client)에게 우리가 보내주고 싶은 데이터가 있다면 response 객체를 통해 보내줄 수 있다.
		System.out.println("hello서블릿의 doGet() 실행!!!!!");
		
//		응답 객체의 contentType을 수정한다.
//		contentType은 보내는 데이터의 타입을 의미한다.
//		text/plain; -> 일반 텍스트를 의미
//		charset=utf-8 -> 인코딩 타입이 utf-8 인 것을 의미한다.(utf-8로 설정해야 한글이 깨지지않는다)
		response.setContentType("text/plain;charset=utf-8");
		
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		out.append("hello!")
			.append("반가워@@");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
