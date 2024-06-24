package com.example.app;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.example.config.MyBatisConfig;
import com.example.dao.MemberDAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/join")
public class JoinServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("GET /join ...");
		req.getRequestDispatcher("/WEB-INF/views/join.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String loginId =  req.getParameter("loginId");
		String password = req.getParameter("password");
		String name = req.getParameter("name");
		int age = Integer.parseInt(req.getParameter("age"));
		
		System.out.println("POST /join ...");
		System.out.println(name);
		
		MemberDAO memberDAO = new MemberDAO();
	
		Map<String, String> memberMap = new HashMap<>();
		memberMap.put("loginId", loginId);
		memberMap.put("password", password);
		memberMap.put("name", name);
		memberMap.put("age", age + "");

		memberDAO.insertMember(memberMap);
			
		req.getRequestDispatcher("/index.html").forward(req, resp);
	}
}
