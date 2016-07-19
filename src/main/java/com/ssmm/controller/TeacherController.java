package com.ssmm.controller;

import java.util.HashSet;
import java.util.List;

import javax.annotation.Resource;

import net.sf.json.JSONArray;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssmm.model.Teacher;
import com.ssmm.service.TeacherService;


@Controller
public class TeacherController {
	//@Resource
	@Autowired
	private TeacherService  teacherService;
	
	@RequestMapping(value="/wl" ,produces="charset=UTF-8" )
	@ResponseBody
	public List  teacherInfo(@RequestParam Integer teacherid ){
	//	System.out.println(teacherid);
		
//		Teacher userById = teacherService.getUserById(teacherid);
		List<Teacher> userById = teacherService.getUserById(teacherid);
		//System.out.println(userById);
		//JSONArray fromObject = JSONArray.fromObject(userById);	
		System.out.println(userById);
		
		
		
	
		return userById;
		
	}
	public   static   void  removeDuplicate(List list)   { 
	    HashSet h  =   new  HashSet(list); 
	    list.clear(); 
	    list.addAll(h); 
	    System.out.println(list); 
	} 
	

}
