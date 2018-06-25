package com.atyang.librarySystem.dao;

import java.util.List;

import com.atyang.librarySystem.pojo.Record;
import com.atyang.librarySystem.pojo.Return;
import com.atyang.librarySystem.pojo.ReturnId;
import com.atyang.librarySystem.pojo.Student;

public interface ReturnDAO extends BaseDAO<Return>{

	/** 
	 * ���ݽ��ĵ�ѧ�������黹���¼
	 * @param stu
	 * @return
	 */
	public List<Record> getStuRecord(Student stu);
	
	/**
	 * ��������һ�������¼
	 * @param returnId 
	 */
	public void add(ReturnId returnId);
}