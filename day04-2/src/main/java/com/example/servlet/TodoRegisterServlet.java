package com.example.servlet;

import java.io.IOException;

import com.example.dao.TodoDAO;
import com.example.dto.TodoDTO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class TodoRegisterServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("GET /day04-2/register");
		req.getRequestDispatcher("/WEB-INF/views/register.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("POST /register @@@@");
		
		String writer = req.getParameter("writer");
		String title = req.getParameter("title");
		String todoDate = req.getParameter("todoDate");
		
		System.out.println(writer);
		System.out.println(title);
		System.out.println(todoDate);
		
		TodoDTO todoDTO = new TodoDTO();
		todoDTO.setWriter(writer);
		todoDTO.setTitle(title);
		todoDTO.setTodoDate(todoDate);
		
		TodoDAO todoDAO = new TodoDAO();
		todoDAO.insertTodo(todoDTO);
		
//		포워딩 방식
//		req.getRequestDispatcher("/WEB-INF/views/list.jsp").forward(req, resp);
		
//		리다이렉트 방식
		resp.sendRedirect("/list");
	}
}




















