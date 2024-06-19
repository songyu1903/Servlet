package com.koreait.app;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


// 어노테이션 사용할려면 import를 해야한다
@WebServlet("/my-page")
public class HtmlServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("HtmlServlet doGet() 실행!!!!!!!!!!!!");
		
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		
		out.append("<html>");
		
		out.append("<head>");
		out.append("</head>");
		
		out.append("<body>");
		out.append("<h1>마이페이지</h1>");
		out.append("<p>안녕하세요</p>");
		
		out.append("<form action='/ex01/result' method='get'>");
		out.append("이름 : <input type='text' name='userName'>");
		out.append("<br>");
		out.append("나이 : <input type='text' name='userAge'>");
		out.append("<br>");
		out.append("<button type='submit'>전송</button>");
		out.append("</form>");
		
		out.append("</body>");
		
		out.append("</html>");
	}
}
