/**
 * 
 */
package com.atyang.librarySystem.dao.impl;

import org.springframework.stereotype.Repository;

import com.atyang.librarySystem.dao.ManagerDAO;
import com.atyang.librarySystem.pojo.Manager;

/**
 * @���� �����
 * @����ʱ�䣺2017-6-20
 * @�������ݣ�
 */
@Repository("mgrDao")
public class ManagerDAOImpl extends BaseDAOImpl<Manager> implements ManagerDAO {

	/**
	 * ��ѯ����Ա��Ϣ  ���ڵ�¼
	 * @param mgrNo
	 * @return
	 */
	public Manager get(int mgrNo , String password){
		Manager mgr = (Manager) getSession().createQuery("FROM Manager WHERE mgrNo = :mgrNo AND password = :password")
				.setInteger("mgrNo", mgrNo).setString("password", password).uniqueResult();
		return mgr;
	}
}
