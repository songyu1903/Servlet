package com.example.app.ex01;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/result")
public class ResultServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userName = req.getParameter("userName");
		int userAge = Integer.parseInt(req.getParameter("userAge"));
		
		System.out.println("userName : " + userName);
		System.out.println("userAge : " + userAge);
		
		req.setAttribute("userName", userName);
		req.setAttribute("userAge", userAge);
		
		req.getRequestDispatcher("/WEB-INF/views/result.jsp").forward(req, resp);
	}
}
