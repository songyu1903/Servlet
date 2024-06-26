package com.example.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("*.td")
public class TodoFrontController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("GET /*.td");
		doProcess(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("POST /*.td");
		doProcess(req, resp);
	}
	
	protected void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(req.getRequestURI());
		
//		루트 경로
		System.out.println(req.getContextPath());
		
		String target = req.getRequestURI();
		switch(target) {
		case "/list.td" :
			System.out.println("list");
			TodoListController todoListController = new TodoListController();
			todoListController.execute(req, resp);
			break;
		case "/register.td" :
			System.out.println("register");
			req.getRequestDispatcher("/WEB-INF/views/register.jsp").forward(req, resp);
			break;
		case "/registerOk.td" :
			new TodoRegisterOkController().execute(req, resp);
			break;
		case "/detail.td" :
			System.out.println("detail");
			new TodoDetailController().execute(req, resp);
			break;
		}
	}
	
}
