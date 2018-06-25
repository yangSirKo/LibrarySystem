/**
 * 
 */
package com.atyang.librarySystem.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.atyang.librarySystem.dao.BaseDAO;

/**
 * @作者 杨金鹏
 * @创建时间：2017-6-20
 * @创建内容：
 */
@Repository
@Lazy
public class BaseDAOImpl<T> implements BaseDAO<T> {
	
	@Autowired
	protected SessionFactory sessionFactory;
	
	public void getSessionFactory(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}
	
	public Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	
	
}
