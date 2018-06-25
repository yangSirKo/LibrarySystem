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
public interface StudentBiz {

	/**
	 * 学生使用姓名登录的方法
	 * @param stuName
	 * @return
	 */
	int loginStuByName(String stuName);
	
	/**
	 * 学生使用学号登录的方法
	 * @param stuName
	 * @return
	 */
	int loginStuById(Integer stuNo);
	
	/**
	 * 学生申请借阅图书
	 * @param recordId
	 * 
	 * 向Record表插入一条记录，，Book表改待审核，等待管理员同意，，同意则Book表改为‘借出’，
	 * 不同意则改为可借，同时删除Record 插入的那条借阅记录
	 */
	public void applyRecord(RecordId recordId);
	
	/**
	 * 学生申请还书
	 * @param returnId
	 * @param bookNo 书号
	 * 
	 * 向Return表插入一条记录，，Book表改待审核，等待管理员同意，，同意则Book表改为‘借出’，
	 * 不同意则改为可借，同时删除Record 插入的那条借阅记录
	 */
	void applyReturnBook(ReturnId returnId);
	
	/**
	 * 查询所有图书
	 * @return
	 */
	List<Book> getAllBook();
	
	/**
	 * 查询某学生所借之书
	 */
	List<Book> getStuRecordBooks(Integer stuNo);
	
	/**
	 * 查询学生所借之书
	 */
	List<Book> getStuRecordBooks();
	
}








