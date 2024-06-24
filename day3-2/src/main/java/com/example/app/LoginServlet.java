package com.example.app;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.example.config.MyBatisConfig;
import com.example.dao.MemberDAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("GET /login.jsp");
		req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("POST /login.jsp");
		
		String loginId = req.getParameter("loginId");
		String password = req.getParameter("password");
		
		System.out.println(loginId);
		System.out.println(password);
		
		MemberDAO memberDAO = new MemberDAO();
		
		Map<String, String> loginMap = new HashMap<>();
		loginMap.put("loginId", loginId);
		loginMap.put("password", password);
		
		int memberId = memberDAO.selectMemberId(loginMap);
		
		System.out.println(memberId);
		
		req.getRequestDispatcher("/index.html").forward(req, resp);
	}
}
