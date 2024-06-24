package com.example.app;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.example.config.MyBatisConfig;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/join")
public class JoinServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("GET /day03/join ...");
		req.getRequestDispatcher("/WEB-INF/views/join.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String loginId =  req.getParameter("loginId");
		String password = req.getParameter("password");
		String name = req.getParameter("name");
		int age = Integer.parseInt(req.getParameter("age"));
		
		System.out.println("POST /day03/join ...");
		System.out.println(name);
		
		SqlSessionFactory sessionFactory = MyBatisConfig.getSqlSessionFactory();
		
//		openSession()에 true를 전달해야 auto commit이 된다.
		SqlSession sqlSession = sessionFactory.openSession(true);
//		sqlSession에는 insert, select, update, delete 메서드가 존재한다.
//		매개변수로 미리 작성한 sql문의 위치를 알려주면된다.
//		sql문은 mapper파일에 작성되어야한다.
//		
		
		Map<String, String> memberMap = new HashMap<>();
		memberMap.put("loginId", loginId);
		memberMap.put("password", password);
		memberMap.put("name", name);
		memberMap.put("age", age + "");
		
		sqlSession.insert("member.insertMember" , memberMap);
//		sqlSession.select();
//		sqlSession.delete();
//		sqlSession.update();
	}
}
