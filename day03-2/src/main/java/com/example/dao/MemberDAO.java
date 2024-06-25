package com.example.dao;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.example.config.MyBatisConfig;

public final class MemberDAO {
	private SqlSession sqlSession;
	
	public MemberDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public void insertMember(Map<String, String> memberMap) {
		sqlSession.insert("member.insertMember" , memberMap);	
	}
	
	public int selectMemberId(Map<String, String> loginMap) {
		int memberId = sqlSession.selectOne("member.selectMemberId", loginMap);
		return memberId;
	}
}
