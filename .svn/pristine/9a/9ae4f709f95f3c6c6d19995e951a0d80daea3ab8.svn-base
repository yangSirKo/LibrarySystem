/**
 * 
 */
package com.atyang.librarySystem.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.atyang.librarySystem.dao.BookDAO;
import com.atyang.librarySystem.pojo.Book;
import com.atyang.librarySystem.pojo.Record;
import com.atyang.librarySystem.pojo.RecordId;
import com.atyang.librarySystem.pojo.ReturnId;
import com.atyang.librarySystem.util.LeftJoinSelete;

/**
 * @作者 杨金鹏
 * @创建时间：2017-6-20
 * @创建内容： 注意： @Repository("BookDao") 表现了这是一个 数据访问层， dao名为 BookDao
 */
@Repository("bookDao")
@SuppressWarnings("unchecked")
public class BookDAOImpl extends BaseDAOImpl<Book> implements BookDAO {

	/**
	 * 查出所有书籍
	 * 
	 * @return 所有书的集合
	 */
	public List<Book> getAll() {
		List<Book> books = getSession().createQuery("FROM Book").list();
		return books;
	}

	/**
	 * 按照书名进行模糊查询
	 * 
	 * @param bookName
	 * @return 匹配的书的集合
	 */
	public List<Book> get(String bookName) {
		String bookName2 = "_" + bookName + "_";
		List<Book> books = getSession()
				.createQuery("FROM Book WHERE bookName like :bookName ")
				.setString("bookName", bookName2).list();
		return books;
	}

	/**
	 * 添加图书
	 * 
	 * @param book
	 */
	public void add(Book book) {
		getSession().save(book);
	}

	/**
	 * 处理 Book的使用状态 可处理借书、还书的申请
	 */
	@Override
	public void updateBookState(String state, Object recordIdOrReturnId) {

		if (recordIdOrReturnId != null) {

			if (recordIdOrReturnId instanceof RecordId) {
				RecordId recordId = (RecordId) recordIdOrReturnId;
				getSession().createQuery(
						"UPDATE Book SET bookState ='" + state
								+ "' WHERE bookNo = "
								+ recordId.getBook().getBookNo())
						.executeUpdate();

			} else if (recordIdOrReturnId instanceof ReturnId) {
				ReturnId returnId = (ReturnId) recordIdOrReturnId;
				getSession().createQuery(
						"UPDATE Book SET bookState ='" + state
								+ "' WHERE bookNo = "
								+ returnId.getBook().getBookNo())
						.executeUpdate();
			}
		}
	}

	/**
	 * 管理员处理图书状态的方法
	 */
	@Override
	public void alterBookState(String state, Integer bookNo) {

		getSession().createQuery(
				"UPDATE Book SET BookState = '" + state + "' where BookNo = "
						+ bookNo).executeUpdate();
	}

	/**
	 * 查借书记录
	 */
	public List<Record> getStuBooks2(Integer stuNo) {
		String hql = "from Record where stuNo = " + stuNo;
		return (List<Record>) getSession().createQuery(hql);
	}

	/**
	 * 通过学号进行左外连接查询某学生所借的书
	 * 
	 * @return
	 */
	public List<Book> getStuBooks(Integer stuNo) {
		LeftJoinSelete ls = new LeftJoinSelete();
		List<Book> books = null;
		try {
			books = ls.getSelelt(stuNo);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return books;
	}

	/**
	 * 查询学生借成功的书 此方法不使用
	 */
	public List<Book> getStuBooks() {
		List<Book> books = getSession().createQuery("FROM Record").list();
		return books;
	}

	/**
	 * 查出所有待处理书籍
	 * 
	 * @return 所有书的集合
	 */
	@Override
	public List<Book> getWaitBooks() {
		return getSession().createQuery(
				"FROM Book WHERE bookState NOT IN ('可借','已借出')").list();
	}
}
