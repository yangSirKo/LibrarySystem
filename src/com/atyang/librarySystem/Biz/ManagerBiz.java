/**
 * 
 */
package com.atyang.librarySystem.Biz;

import java.util.List;

import com.atyang.librarySystem.pojo.Book;
import com.atyang.librarySystem.pojo.RecordId;
import com.atyang.librarySystem.pojo.ReturnId;

/**
 * @���� �����
 * @����ʱ�䣺2017-6-20
 * @�������ݣ�
 */
public interface ManagerBiz{

	/**
	 * ��֤������¼
	 * @param mgrNo
	 * @param password
	 * @return
	 */
	int loginMgr(int mgrNo , String password);
	
	/**
	 * ����ѧ�����飬��Book��״̬��Ϊ���   ����Ա����ʱ���� 
	 * @param bookNo
	 */
	void agreeRecordBookById(Integer bookNo);
	
	/**
	 * ����ѧ�����飬��Book��״̬��Ϊ���   
	 * @param recordId
	 */
	void agreeRecordBook(RecordId recordId);
	
	/**
	 * ����ѧ�����飬��Book��״̬��Ϊ�ɽ�   ����Ա����ʱ����
	 * @param bookNo
	 */
	public void agreeReturnBookById(Integer bookNo);
	
	/**
	 * ����ѧ�����飬��Book��״̬��Ϊ�ɽ�   
	 * @param returnId
	 */
	public void agreeReturnBook(ReturnId returnId);
	
	/**
	 * ��ѯ����ͼ��
	 * @return
	 */
	List<Book> getAllBook();
	
	/**
	 * ��ѯ���д�����ͼ��
	 * @return
	 */
	public List<Book> getWaitBook();
}