/**
 * 
 */
package com.atyang.librarySystem.Biz.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.atyang.librarySystem.dao.BookDAO;
import com.atyang.librarySystem.dao.ManagerDAO;
import com.atyang.librarySystem.dao.RecordDAO;
import com.atyang.librarySystem.dao.ReturnDAO;
import com.atyang.librarySystem.dao.StudentDAO;

/**
 * @作者 杨金鹏
 * @创建时间：2017-6-20
 * @创建内容：
 */
@Service("baseBiz")
public class BaseBizImpl {

	@Autowired @Qualifier("bookDao")
	protected BookDAO bookDao;
	
	@Autowired @Qualifier("mgrDao")
	protected ManagerDAO mgrDao;
	
	@Autowired @Qualifier("stuDao")
	protected StudentDAO stuDao;
	
	@Autowired @Qualifier("returnDao")
	protected ReturnDAO returnDao;
	
	@Autowired @Qualifier("recordDao")
	protected RecordDAO recordDao;
	
	public void setBookDao(BookDAO bookDao) {
		this.bookDao = bookDao;
	}

	public void setMgrDao(ManagerDAO mgrDao) {
		this.mgrDao = mgrDao;
	}

	public void setStuDao(StudentDAO stuDao) {
		this.stuDao = stuDao;
	}

	public void setReturnDao(ReturnDAO returnDao) {
		this.returnDao = returnDao;
	}

	public void setRecordDao(RecordDAO recordDao) {
		this.recordDao = recordDao;
	}
	
}
