/**
 * 
 */
package com.atyang.librarySystem.dao.impl;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.atyang.librarySystem.dao.RecordDAO;
import com.atyang.librarySystem.pojo.Record;
import com.atyang.librarySystem.pojo.RecordId;
import com.atyang.librarySystem.pojo.Student;

/**
 * @作者 杨金鹏
 * @创建时间：2017-6-20
 * @创建内容：
 */
@Repository("recordDao")
@SuppressWarnings("unchecked")
public class RecordDAOImpl extends BaseDAOImpl<Record> implements RecordDAO {

	/** 
	 * 根据借阅的学生姓名查借阅记录
	 * @param stu
	 * @return
	 */
	public List<Record> getStuRecord(Student stu){
		List<Record> records = getSession().createQuery("FROM Record WHERE stuNo = :stuNo")
				.setInteger("stuNo", stu.getStuNo()).list();
		return records;
		
	}

	@Override
	public void add(RecordId recordId) {
		
		Record record = new Record();
		record.setId(recordId);
		record.setRecordTime(new Date());
		getSession().save(record);
		
	}


}
