package com.koreait.app;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/result")
public class ResultServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("GET /ex01/result");
		
//		req는 사용자가 입력한 폼 데이터를 가지고 있다.
//		폼 데이터를 꺼내는 방법은 getParameter("데이터이름") 을 사용하면 된다.
//		데이터의 이름은 input 태그의 name 속성에 입력한 값과 동일하다.
//		반환 타입은 문자열(String)이다.
		String userName = req.getParameter("userName");
		String userAge =  req.getParameter("userAge");
		
		
		System.out.println(userName);
		System.out.println(userAge);
		
		int age =Integer.parseInt(userAge);
		
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		
		out.append("<html>");
		
		out.append("<head>");
		out.append("</head>");
		
		out.append("<body>");
		out.append("<h1>Result Page</h1>");
		out.append("<p>이름 : " + userName + "</p>");
		out.append("<p>나이 : " + userAge + "</p>");
		out.append("<p>나이 : " + (age - 2) + "</p>");
		out.append("</body>");
		
		out.append("</html>");
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("POST /ex01/result");
	}
}
