package com.ssmm.service;

import java.util.List;

import com.ssmm.model.Teacher;
import com.ssmm.model.TeacherInfo;


public interface TeacherService {
	
	public List<Teacher> getUserById(int id);
	
}
