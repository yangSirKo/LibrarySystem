package com.atyang.librarySystem.dao;

import com.atyang.librarySystem.pojo.Manager;

public interface ManagerDAO extends BaseDAO<Manager>{
	
	/**
	 * ��ѯ����Ա��Ϣ  ���ڵ�¼
	 * @param mgrNo
	 * @return
	 */
	public Manager get(int mgrNo , String password);
}