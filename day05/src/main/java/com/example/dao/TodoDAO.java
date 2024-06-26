package com.example.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.example.config.MyBatisConfig;
import com.example.dto.TodoDTO;

public class TodoDAO {
	
	private SqlSession sqlSession;
	
	public TodoDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public void insertTodo(TodoDTO todoDTO) {
		sqlSession.insert("todo.insertTodo", todoDTO);
	}
	public List<TodoDTO> selectAll() {
		List<TodoDTO> todoList = sqlSession.selectList("todo.selectAll");
		return todoList;
	}
	
	public TodoDTO selectTodo(int todoId) {
		TodoDTO todoDTO = sqlSession.selectOne("todo.selectTodo" , todoId);
		return todoDTO;
	}
	
}
