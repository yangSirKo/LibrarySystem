/**
 * 
 */
package com.atyang.librarySystem.dao.impl;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.atyang.librarySystem.dao.ReturnDAO;
import com.atyang.librarySystem.pojo.Record;
import com.atyang.librarySystem.pojo.Return;
import com.atyang.librarySystem.pojo.ReturnId;
import com.atyang.librarySystem.pojo.Student;

/**
 * @���� �����
 * @����ʱ�䣺2017-6-20
 * @�������ݣ�
 */
@Repository("returnDao")
@SuppressWarnings("unchecked")
public class ReturnDAOImpl extends BaseDAOImpl<Return> implements ReturnDAO {

	/** 
	 * ���ݽ��ĵ�ѧ�������黹���¼
	 * @param stu
	 * @return
	 */
	public List<Record> getStuRecord(Student stu){
		List<Record> records = getSession().createQuery("FROM Record WHERE stuNo = :stuNo")
				.setInteger("stuNo", stu.getStuNo()).list();
		return records;
	}

	/**
	 * ���������һ�������¼
	 * @param returnId 
	 */
	@Override
	public void add(ReturnId returnId) {
		Return returnAdd = new Return();
		returnAdd.setId(returnId);
		returnAdd.setReturnTime(new Date());
		getSession().save(returnAdd);	
	}
	
}