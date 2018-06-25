/**
 * 
 */
package com.atyang.librarySystem.Biz;

import java.util.List;

import com.atyang.librarySystem.pojo.Book;
import com.atyang.librarySystem.pojo.RecordId;
import com.atyang.librarySystem.pojo.ReturnId;

/**
 * @作者 杨金鹏
 * @创建时间：2017-6-20
 * @创建内容：
 */
public interface ManagerBiz{

	/**
	 * 验证经理登录
	 * @param mgrNo
	 * @param password
	 * @return
	 */
	int loginMgr(int mgrNo , String password);
	
	/**
	 * 批复学生借书，将Book表状态改为借出   管理员处理时方法 
	 * @param bookNo
	 */
	void agreeRecordBookById(Integer bookNo);
	
	/**
	 * 批复学生借书，将Book表状态改为借出   
	 * @param recordId
	 */
	void agreeRecordBook(RecordId recordId);
	
	/**
	 * 批复学生还书，将Book表状态改为可借   管理员处理时方法
	 * @param bookNo
	 */
	public void agreeReturnBookById(Integer bookNo);
	
	/**
	 * 批复学生还书，将Book表状态改为可借   
	 * @param returnId
	 */
	public void agreeReturnBook(ReturnId returnId);
	
	/**
	 * 查询所有图书
	 * @return
	 */
	List<Book> getAllBook();
	
	/**
	 * 查询所有待处理图书
	 * @return
	 */
	public List<Book> getWaitBook();
}
