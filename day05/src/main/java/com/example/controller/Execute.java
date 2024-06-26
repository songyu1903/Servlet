package com.example.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface Execute {
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException;
}
