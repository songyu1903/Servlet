package com.example.servlet;

import java.io.IOException;
import java.util.List;

import com.example.dao.TodoDAO;
import com.example.dto.TodoDTO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/list")
public class TodoListServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("GET /day04-2/list");
		
		TodoDAO todoDAO = new TodoDAO();
		List<TodoDTO> todoList = todoDAO.selectAll();
		
		System.out.println(todoList);
		
		req.setAttribute("todoList", todoList);
		
		req.getRequestDispatcher("/WEB-INF/views/list.jsp").forward(req, resp);
	}
}
