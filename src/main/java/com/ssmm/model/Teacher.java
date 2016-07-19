package com.ssmm.model;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;
@Repository
public class Teacher {

	@Override
	public String toString() {
		return "Teacher [userId=" + userId + ", source=" + source
				+ ", userType=" + userType + ","+
				" school=" + school + "]";
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	private Integer userId;

   
    public final String source="cqzw";
    private String  userType;

    public String getUserType() {
	return userType;
}

public void setUserType(String userType) {
	this.userType = userType;
}

    private  List<TeacherSchool> school;

	public Integer getId() {
        return userId;
    }

    public void setId(Integer id) {
        this.userId = id;
    }

	public List<TeacherSchool> getSchool() {
		return school;
	}

	public void setSchool(List<TeacherSchool> school) {
		this.school = school;
	}


   
   

	
}
 