package com.example.controller;

import java.io.IOException;
import java.util.List;

import com.example.dao.TodoDAO;
import com.example.dto.TodoDTO;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class TodoListController implements Execute{
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		TodoDAO todoDAO = new TodoDAO();
		List<TodoDTO> todoList = todoDAO.selectAll();
		
		System.out.println(todoList);
		
		req.setAttribute("todoList", todoList);
		
		req.getRequestDispatcher("/WEB-INF/views/list.jsp").forward(req, resp);
	}
}
