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
 * @���� �����
 * @����ʱ�䣺2017-6-20
 * @�������ݣ�
 */
@Repository("recordDao")
@SuppressWarnings("unchecked")
public class RecordDAOImpl extends BaseDAOImpl<Record> implements RecordDAO {

	/** 
	 * ���ݽ��ĵ�ѧ����������ļ�¼
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
