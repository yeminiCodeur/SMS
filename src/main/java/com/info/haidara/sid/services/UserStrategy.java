package com.info.haidara.sid.services;

import java.util.ArrayList;

import com.info.haidara.sid.entities.Teacher;

public interface UserStrategy {
	
	public void addNewTeacher(Teacher teacher);

	public ArrayList<Teacher> getListTeacher();

	public Teacher getOneTeacherByCode(String code);
	


}
