package com.example.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.example.app.dto.MemberDTO;

public class MemberDAO {

	public void inserMember(MemberDTO memberDTO) {
		String sql = """
				INSERT INTO TBL_MEMBER(MEMBER_ID, LOGIN_ID, PASSWORD, GENDER)
				VALUES(SEQ_MEMBER.NEXTVAL, ?, ?, ?)
				""";
		
		try (
				Connection conn = DBConnecter.getConnection();
				PreparedStatement ps = conn.prepareStatement(sql);
				){
			
			ps.setString(1, memberDTO.getLoginId());
			ps.setString(2, memberDTO.getPassword());
			ps.setString(3, memberDTO.getGender());
			
			ps.executeUpdate();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	
	}
}
