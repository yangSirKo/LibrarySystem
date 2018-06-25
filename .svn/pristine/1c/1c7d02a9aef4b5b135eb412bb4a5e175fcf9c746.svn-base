/**
 * 
 */
package com.atyang.librarySystem.dao.impl;

import org.springframework.stereotype.Repository;

import com.atyang.librarySystem.dao.ManagerDAO;
import com.atyang.librarySystem.pojo.Manager;

/**
 * @作者 杨金鹏
 * @创建时间：2017-6-20
 * @创建内容：
 */
@Repository("mgrDao")
public class ManagerDAOImpl extends BaseDAOImpl<Manager> implements ManagerDAO {

	/**
	 * 查询管理员信息  用于登录
	 * @param mgrNo
	 * @return
	 */
	public Manager get(int mgrNo , String password){
		Manager mgr = (Manager) getSession().createQuery("FROM Manager WHERE mgrNo = :mgrNo AND password = :password")
				.setInteger("mgrNo", mgrNo).setString("password", password).uniqueResult();
		return mgr;
	}
}
