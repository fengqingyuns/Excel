package com.ssmm.model;

public class TeacherInfo  {

	private  TeacherSchool school;

	public String userId;

	public String userType;
	public final String source="zqzw";
	@Override
	public String toString() {
		return "TeacherInfo [school=" + school + ", userId=" + userId
				+ ", userType=" + userType + ", source=" + source + "]";
	}


	public TeacherSchool getSchool() {
		return school;
	}

	public void setSchool(TeacherSchool school) {
		this.school = school;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}











}
