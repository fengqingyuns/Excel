package com.ssmm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssmm.dao.TeacherMapper;
import com.ssmm.model.Teacher;
import com.ssmm.service.TeacherService;
@Service("teacherService")
public class TeacherServiceImpl implements TeacherService{
	@Resource
	private TeacherMapper teacherMapper;
		
	
	public List<Teacher> getUserById(int id) {
		
		return (List<Teacher>) teacherMapper.selectByPrimaryKey(id);
	}

}
