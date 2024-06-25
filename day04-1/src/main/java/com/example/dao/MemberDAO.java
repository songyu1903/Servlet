package com.example.dao;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.example.config.MyBatisConfig;
import com.example.dto.MemberDTO;

public final class MemberDAO {
	private SqlSession sqlSession;
	
	public MemberDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public void insertMember(MemberDTO memberDTO) {
		sqlSession.insert("member.insertMember" , memberDTO);	
	}
	
	public int selectMemberId(MemberDTO memberDTO) {
		int memberId = sqlSession.selectOne("member.selectMemberId", memberDTO);
		return memberId;
	}
}
