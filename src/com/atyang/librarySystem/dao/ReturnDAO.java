package com.atyang.librarySystem.dao;

import java.util.List;

import com.atyang.librarySystem.pojo.Record;
import com.atyang.librarySystem.pojo.Return;
import com.atyang.librarySystem.pojo.ReturnId;
import com.atyang.librarySystem.pojo.Student;

public interface ReturnDAO extends BaseDAO<Return>{

	/** 
	 * 根据借阅的学生姓名查还书记录
	 * @param stu
	 * @return
	 */
	public List<Record> getStuRecord(Student stu);
	
	/**
	 * 向还书表插入一条还书记录
	 * @param returnId 
	 */
	public void add(ReturnId returnId);
}