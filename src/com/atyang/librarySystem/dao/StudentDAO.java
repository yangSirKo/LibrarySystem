package com.atyang.librarySystem.dao;

import com.atyang.librarySystem.pojo.Student;

public interface StudentDAO extends BaseDAO<Student>{
	
	/**
	 * 根据学生姓名查学生信息
	 * @param stuName
	 * @return
	 */
	public Student getStuName(String stuName);
	
	/**
	 * 根据学生学号查学生信息
	 * @param stuName
	 * @return
	 */
	public Student getStuById(Integer stuNo);
}