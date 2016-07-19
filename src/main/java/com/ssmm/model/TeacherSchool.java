package com.ssmm.model;

import java.util.List;

public class TeacherSchool {
	@Override
	public String toString() {
		return "TeacherSchool [areaId=" + areaId + ", areaName=" + areaName
				+ ", schoolName=" + schoolName + ", provinceId=" + provinceId
				+ ", provinceName=" + provinceName + ", teacherClass="
				+ teacherClass + ", schoolId=" + schoolId + "]";
	}

	private String	areaId; 
	public String getAreaId() {
		return areaId;
	}

	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	private String areaName;
	private String schoolName; 

	public final String provinceId ="1";
	public  final String provinceName="重庆市";

	private List<TeacherClass> teacherClass ;
	
	private String schoolId;  //学校区域 ，id


	public String getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(String schoolId) {
		this.schoolId = schoolId;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public List<TeacherClass> getTeacherClass() {
		return teacherClass;
	}

	public void setTeacherClass(List<TeacherClass> teacherClass) {
		this.teacherClass = teacherClass;
	}

	public String getProvinceId() {
		return provinceId;
	}

	public String getProvinceName() {
		return provinceName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((areaId == null) ? 0 : areaId.hashCode());
		result = prime * result
				+ ((areaName == null) ? 0 : areaName.hashCode());
		result = prime * result
				+ ((provinceId == null) ? 0 : provinceId.hashCode());
		result = prime * result
				+ ((provinceName == null) ? 0 : provinceName.hashCode());
		result = prime * result
				+ ((schoolId == null) ? 0 : schoolId.hashCode());
		result = prime * result
				+ ((schoolName == null) ? 0 : schoolName.hashCode());
		result = prime * result
				+ ((teacherClass == null) ? 0 : teacherClass.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TeacherSchool other = (TeacherSchool) obj;
		if (areaId == null) {
			if (other.areaId != null)
				return false;
		} else if (!areaId.equals(other.areaId))
			return false;
		if (areaName == null) {
			if (other.areaName != null)
				return false;
		} else if (!areaName.equals(other.areaName))
			return false;
		if (provinceId == null) {
			if (other.provinceId != null)
				return false;
		} else if (!provinceId.equals(other.provinceId))
			return false;
		if (provinceName == null) {
			if (other.provinceName != null)
				return false;
		} else if (!provinceName.equals(other.provinceName))
			return false;
		if (schoolId == null) {
			if (other.schoolId != null)
				return false;
		} else if (!schoolId.equals(other.schoolId))
			return false;
		if (schoolName == null) {
			if (other.schoolName != null)
				return false;
		} else if (!schoolName.equals(other.schoolName))
			return false;
		if (teacherClass == null) {
			if (other.teacherClass != null)
				return false;
		} else if (!teacherClass.equals(other.teacherClass))
			return false;
		return true;
	}





}
