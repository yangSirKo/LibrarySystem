package com.atyang.librarySystem.dao;

import java.util.List;

import com.atyang.librarySystem.pojo.Record;
import com.atyang.librarySystem.pojo.RecordId;
import com.atyang.librarySystem.pojo.Student;

public interface RecordDAO extends BaseDAO<Record>{
	
	/** 
	 * 根据借阅的学生姓名查借阅记录
	 * @param stu
	 * @return
	 */
	public List<Record> getStuRecord(Student stu);
	
	/**
	 * 向借阅表插入一条借阅记录
	 * @param recordId 
	 */
	public void add(RecordId recordId);
	
}