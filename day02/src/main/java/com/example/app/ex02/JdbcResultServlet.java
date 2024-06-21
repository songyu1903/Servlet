package com.example.app.ex02;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import com.example.app.dao.DBConnecter;
import com.example.app.dao.MemberDAO;
import com.example.app.dto.MemberDTO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/jdbc-result")
public class JdbcResultServlet extends HttpServlet{
	@Override
	   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	      String loginId = req.getParameter("loginId");
	      String password = req.getParameter("password");
	      String gender = req.getParameter("gender");
	      
	      System.out.println("loginId : " + loginId);
	      System.out.println("password : " + password);
	      System.out.println("gender : " + gender);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("POST /day02/jdbc-result ....");
		
//		req.setCharacterEncoding("utf-8");
		
		String loginId = req.getParameter("loginId");
		String password = req.getParameter("password");
		String gender = req.getParameter("gender");

		System.out.println("loginId : " + loginId);
		System.out.println("password : " + password);
		System.out.println("gender : " + gender);
		
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setLoginId(loginId);
		memberDTO.setPassword(password);
		memberDTO.setGender(gender);
		
		MemberDAO memberDAO = new MemberDAO();
		memberDAO.inserMember(memberDTO);
		
		
//		==========================================================================
//		JDBC
		
//		String sql = """
//				INSERT INTO TBL_MEMBER(MEMBER_ID, LOGIN_ID, PASSWORD, GENDER)
//				VALUES(SEQ_MEMBER.NEXTVAL, ?, ?, ?)
//				""";
//		
//		try (
//				Connection conn = DBConnecter.getConnection();
//				PreparedStatement ps = conn.prepareStatement(sql);
//				){
//			
//			ps.setString(1, loginId);
//			ps.setString(2, password);
//			ps.setString(3, gender);
//			
//			ps.executeUpdate();
//			
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
		
	}
}

























