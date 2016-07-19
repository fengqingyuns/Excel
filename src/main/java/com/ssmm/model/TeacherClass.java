package com.ssmm.model;

import java.util.List;

public class TeacherClass {

	private String classId;
	private String className;
	private String  gradeNo;
	
	private  List<SubjectName>  subject;

	@Override
	public String toString() {
		return "TeacherClass [classId=" + classId + ", className=" + className
				+ ", gradeNo=" + gradeNo + ", subjectName=" + subject + "]";
	}

	public String getClassId() {
		return classId;
	}

	public void setClassId(String classId) {
		this.classId = classId;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getGradeNo() {
		return gradeNo;
	}

	public void setGradeNo(String gradeNo) {
		this.gradeNo = gradeNo;
	}

	public List<SubjectName> getSubjectName() {
		return subject;
	}

	public void setSubjectName(List<SubjectName> subject) {
		this.subject = subject;
	}
	
	
	
	



}
