package com.example.controller;

import java.io.IOException;

import com.example.dao.TodoDAO;
import com.example.dto.TodoDTO;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class TodoDetailController implements Execute{
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("GET /day04-2/detail");

		int todoId = Integer.parseInt(req.getParameter("todoId"));
		System.out.println(todoId);
		
		TodoDAO todoDAO = new TodoDAO();
		TodoDTO todoDTO = todoDAO.selectTodo(todoId);
		
		System.out.println(todoDTO);
		req.setAttribute("todo", todoDTO);
		
		req.getRequestDispatcher("/WEB-INF/views/detail.jsp").forward(req, resp);
	}

}
