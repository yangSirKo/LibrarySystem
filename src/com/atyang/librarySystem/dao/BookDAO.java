package com.atyang.librarySystem.dao;

import java.util.List;

import com.atyang.librarySystem.pojo.Book;

/**
 * 
 * @作者 杨金鹏
 * @创建时间：2017-6-20
 * @创建内容：
 */
public interface BookDAO extends BaseDAO<Book>{
	
	/**
	 * 查出所有书籍
	 * @return 所有书的集合
	 */
	public List<Book> getAll();
	
	/**
	 * 按照书名进行模糊查询
	 * @param bookName
	 * @return  匹配的书的集合
	 */
	public List<Book> get(String bookName);
	
	/**
	 * 添加图书
	 * @param book
	 */
	public void add(Book book);
	
	/**
	 * 修改图书  修改图书是否可借出的状态
	 * @param book
	 */
	void updateBookState(String state, Object recordIdOrReturnId);
	
	/**
	 * 经理处理书本状态 修改图书状态
	 */
	void alterBookState(String state,Integer bookNo);
	
	/**
	 * 查询学生借成功的书
	 */
	List<Book> getStuBooks(Integer stuNo);
	
	/**
	 * 查询学生借成功的书
	 */
	List<Book> getStuBooks();
	
	/**
	 * 查出所有待处理书籍
	 * @return 所有书的集合
	 */
	public List<Book> getWaitBooks();
}







