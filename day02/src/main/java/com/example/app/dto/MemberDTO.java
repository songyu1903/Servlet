package com.example.app.dto;

public class MemberDTO {
	int memberId;
	private String loginId;
	private String password;
	private String gender;
	
	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "MemberDTO [memberId=" + memberId + ", loginId=" + loginId + ", password=" + password + ", gender="
				+ gender + "]";
	}

}
