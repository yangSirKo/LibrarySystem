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
 * @作者 杨金鹏
 * @创建时间：2017-6-20
 * @创建内容：
 */
@Repository("returnDao")
@SuppressWarnings("unchecked")
public class ReturnDAOImpl extends BaseDAOImpl<Return> implements ReturnDAO {

	/** 
	 * 根据借阅的学生姓名查还书记录
	 * @param stu
	 * @return
	 */
	public List<Record> getStuRecord(Student stu){
		List<Record> records = getSession().createQuery("FROM Record WHERE stuNo = :stuNo")
				.setInteger("stuNo", stu.getStuNo()).list();
		return records;
	}

	/**
	 * 向还书表插入一条还书记录
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
