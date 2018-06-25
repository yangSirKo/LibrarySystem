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
 * @���� �����
 * @����ʱ�䣺2017-6-20
 * @�������ݣ� ע�⣺ @Repository("BookDao") ����������һ�� ���ݷ��ʲ㣬 dao��Ϊ BookDao
 */
@Repository("bookDao")
@SuppressWarnings("unchecked")
public class BookDAOImpl extends BaseDAOImpl<Book> implements BookDAO {

	/**
	 * ��������鼮
	 * 
	 * @return ������ļ���
	 */
	public List<Book> getAll() {
		List<Book> books = getSession().createQuery("FROM Book").list();
		return books;
	}

	/**
	 * ������������ģ����ѯ
	 * 
	 * @param bookName
	 * @return ƥ�����ļ���
	 */
	public List<Book> get(String bookName) {
		String bookName2 = "_" + bookName + "_";
		List<Book> books = getSession()
				.createQuery("FROM Book WHERE bookName like :bookName ")
				.setString("bookName", bookName2).list();
		return books;
	}

	/**
	 * ���ͼ��
	 * 
	 * @param book
	 */
	public void add(Book book) {
		getSession().save(book);
	}

	/**
	 * ���� Book��ʹ��״̬ �ɴ�����顢���������
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
	 * ����Ա����ͼ��״̬�ķ���
	 */
	@Override
	public void alterBookState(String state, Integer bookNo) {

		getSession().createQuery(
				"UPDATE Book SET BookState = '" + state + "' where BookNo = "
						+ bookNo).executeUpdate();
	}

	/**
	 * ������¼
	 */
	public List<Record> getStuBooks2(Integer stuNo) {
		String hql = "from Record where stuNo = " + stuNo;
		return (List<Record>) getSession().createQuery(hql);
	}

	/**
	 * ͨ��ѧ�Ž����������Ӳ�ѯĳѧ���������
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
	 * ��ѯѧ����ɹ����� �˷�����ʹ��
	 */
	public List<Book> getStuBooks() {
		List<Book> books = getSession().createQuery("FROM Record").list();
		return books;
	}

	/**
	 * ������д������鼮
	 * 
	 * @return ������ļ���
	 */
	@Override
	public List<Book> getWaitBooks() {
		return getSession().createQuery(
				"FROM Book WHERE bookState NOT IN ('�ɽ�','�ѽ��')").list();
	}
}
