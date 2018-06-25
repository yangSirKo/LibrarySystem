package com.atyang.librarySystem.dao;

import java.util.List;

import com.atyang.librarySystem.pojo.Record;
import com.atyang.librarySystem.pojo.RecordId;
import com.atyang.librarySystem.pojo.Student;

public interface RecordDAO extends BaseDAO<Record>{
	
	/** 
	 * ���ݽ��ĵ�ѧ����������ļ�¼
	 * @param stu
	 * @return
	 */
	public List<Record> getStuRecord(Student stu);
	
	/**
	 * ����ı����һ�����ļ�¼
	 * @param recordId 
	 */
	public void add(RecordId recordId);
	
}