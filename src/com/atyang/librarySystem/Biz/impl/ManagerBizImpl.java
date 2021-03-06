/**
 * 
 */
package com.atyang.librarySystem.Biz.impl;

import static com.atyang.librarySystem.Biz.BaseFinal.LOGIN_FAIL;
import static com.atyang.librarySystem.Biz.BaseFinal.LOGIN_MGR;

import java.util.List;

import org.springframework.stereotype.Service;

import com.atyang.librarySystem.Biz.ManagerBiz;
import com.atyang.librarySystem.pojo.Book;
import com.atyang.librarySystem.pojo.RecordId;
import com.atyang.librarySystem.pojo.ReturnId;

/**
 * @作者 杨金鹏
 * @创建时间：2017-6-20
 * @创建内容：
 */
@Service("mgrBiz")
public class ManagerBizImpl extends BaseBizImpl implements ManagerBiz {

	@Override
	public int loginMgr(int mgrNo, String password) {
		if (mgrDao.get(mgrNo, password) != null) {
			return LOGIN_MGR; // 登录成功
		}
		return LOGIN_FAIL; // 登录失败
	}

	/**
	 * 批复学生还书，将Book表状态改为可借 管理员所用方法
	 * 
	 * @param bookNo
	 */
	@Override
	public void agreeReturnBookById(Integer bookNo) {
		String state = "可借";
		bookDao.alterBookState(state, bookNo);
	}

	/**
	 * 批复学生还书，将Book表状态改为可借
	 * 
	 * @param recordId
	 */
	@Override
	public void agreeReturnBook(ReturnId returnId) {
		String state = "可借";
		bookDao.updateBookState(state, returnId);
	}

	/**
	 * 批复学生借书，将Book表状态改为借出 管理员所用方法
	 * 
	 * @param bookNo
	 */
	@Override
	public void agreeRecordBookById(Integer bookNo) {
		String state = "已借出";
		bookDao.alterBookState(state, bookNo);
	}

	/**
	 * 批复学生借书，将Book表该书状态改为借出
	 * 
	 * @param recordId
	 */
	@Override
	public void agreeRecordBook(RecordId recordId) {
		String state = "已借出";
		bookDao.updateBookState(state, recordId);
	}

	/**
	 * 查询所有图书
	 * 
	 * @return
	 */
	public List<Book> getAllBook() {
		List<Book> books = bookDao.getAll();
		for (Book book : books) {
			System.out.println(book);
		}
		return books;
	}

	/**
	 * 查询所有待处理图书
	 * 
	 * @return
	 */
	public List<Book> getWaitBook() {
		List<Book> books = bookDao.getWaitBooks();
		for (Book b : books) {
			System.out.println(b);
		}
		return books;
	}

}
