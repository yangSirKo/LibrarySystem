/**
 * 
 */
package com.atyang.librarySystem.dao.impl;

import org.springframework.stereotype.Repository;

import com.atyang.librarySystem.dao.StudentDAO;
import com.atyang.librarySystem.pojo.Student;

/**
 * @���� �����
 * @����ʱ�䣺2017-6-20
 * @�������ݣ�
 */
@Repository("stuDao")
public class StudentDAOImpl extends BaseDAOImpl<Student> implements StudentDAO {

	/**
	 * ����ѧ��������ѧ����Ϣ
	 * @param stuName
	 * @return
	 */
	public Student getStuName(String stuName){
		Student stu = (Student) getSession().createQuery("FROM Student WHERE stuName = :stuName ")
				.setString("stuName", stuName).list();
		return stu;
	}

	/**
	 * ����ѧ��������ѧ����Ϣ
	 * @param stuName
	 * @return
	 */
	@Override
	public Student getStuById(Integer stuNo) {
		Student stu = (Student) getSession().createQuery("FROM Student WHERE stuNo = :stuNo ")
				.setInteger("stuNo", stuNo).uniqueResult();
		return stu;
	}
	
	
}