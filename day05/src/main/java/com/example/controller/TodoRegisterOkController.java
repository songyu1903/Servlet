package com.example.controller;

import java.io.IOException;

import com.example.dao.TodoDAO;
import com.example.dto.TodoDTO;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class TodoRegisterOkController implements Execute{
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
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
