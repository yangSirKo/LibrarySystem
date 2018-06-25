/**
 * 
 */
package com.atyang.librarySystem.Biz.impl;

import static com.atyang.librarySystem.Biz.BaseFinal.LOGIN_FAIL;
import static com.atyang.librarySystem.Biz.BaseFinal.LOGIN_STU;

import java.util.List;

import org.springframework.stereotype.Service;

import com.atyang.librarySystem.Biz.StudentBiz;
import com.atyang.librarySystem.pojo.Book;
import com.atyang.librarySystem.pojo.RecordId;
import com.atyang.librarySystem.pojo.ReturnId;

/**
 * @���� �����
 * @����ʱ�䣺2017-6-20
 * @�������ݣ�
 */
@Service("stuBiz")
public class StudentBizImpl extends BaseBizImpl implements StudentBiz {

	/**
	 * ѧ��ʹ��������¼
	 */
	@Override
	public int loginStuByName(String stuName) {
		if (stuDao.getStuName(stuName) != null) {
			return LOGIN_STU;
		}
		return LOGIN_FAIL;
	}

	/**
	 * ѧ��ʹ��ѧ�ŵ�¼
	 */
	@Override
	public int loginStuById(Integer stuNo) {
		if (stuDao.getStuById(stuNo) != null) {
			return LOGIN_STU;
		}
		return LOGIN_FAIL;
	}

	/**
	 * ѧ���������
	 */
	@Override
	public void applyRecord(RecordId recordId) {
		// ����ı�����һ�����ļ�¼
		recordDao.add(recordId);
		// �޸�Book���иñ�����Ƿ�ɽ�״̬
		String state = "��������";
		bookDao.updateBookState(state, recordId);
	}

	/**
	 * ѧ�����뻹��
	 * 
	 * @param returnId
	 */
	@Override
	public void applyReturnBook(ReturnId returnId) {
		// ���������һ�������¼
		returnDao.add(returnId);
		// �޸�Book���иñ�����Ƿ�ɽ�״̬
		String state = "��������";
		bookDao.updateBookState(state, returnId);
	}

	/**
	 * ��ѯ����ͼ��
	 * 
	 * @return
	 */
	@Override
	public List<Book> getAllBook() {
		List<Book> books = bookDao.getAll();
		for (Book b : books) {
			System.out.println(b);
		}
		return books;
	}

	/**
	 * ��ѯѧ������֮��
	 */
	@Override
	public List<Book> getStuRecordBooks(Integer stuNo) {
		List<Book> books = bookDao.getStuBooks(stuNo);
		for (Book b : books) {
			System.out.println(b);
		}
		return books;
	}

	/**
	 * ��ѯѧ������֮��
	 */
	@Override
	public List<Book> getStuRecordBooks() {
		List<Book> books = bookDao.getStuBooks();
		return books;
	}

}