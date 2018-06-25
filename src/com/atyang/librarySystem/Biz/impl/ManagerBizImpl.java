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
 * @���� �����
 * @����ʱ�䣺2017-6-20
 * @�������ݣ�
 */
@Service("mgrBiz")
public class ManagerBizImpl extends BaseBizImpl implements ManagerBiz {

	@Override
	public int loginMgr(int mgrNo, String password) {
		if (mgrDao.get(mgrNo, password) != null) {
			return LOGIN_MGR; // ��¼�ɹ�
		}
		return LOGIN_FAIL; // ��¼ʧ��
	}

	/**
	 * ����ѧ�����飬��Book��״̬��Ϊ�ɽ� ����Ա���÷���
	 * 
	 * @param bookNo
	 */
	@Override
	public void agreeReturnBookById(Integer bookNo) {
		String state = "�ɽ�";
		bookDao.alterBookState(state, bookNo);
	}

	/**
	 * ����ѧ�����飬��Book��״̬��Ϊ�ɽ�
	 * 
	 * @param recordId
	 */
	@Override
	public void agreeReturnBook(ReturnId returnId) {
		String state = "�ɽ�";
		bookDao.updateBookState(state, returnId);
	}

	/**
	 * ����ѧ�����飬��Book��״̬��Ϊ��� ����Ա���÷���
	 * 
	 * @param bookNo
	 */
	@Override
	public void agreeRecordBookById(Integer bookNo) {
		String state = "�ѽ��";
		bookDao.alterBookState(state, bookNo);
	}

	/**
	 * ����ѧ�����飬��Book������״̬��Ϊ���
	 * 
	 * @param recordId
	 */
	@Override
	public void agreeRecordBook(RecordId recordId) {
		String state = "�ѽ��";
		bookDao.updateBookState(state, recordId);
	}

	/**
	 * ��ѯ����ͼ��
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
	 * ��ѯ���д�����ͼ��
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