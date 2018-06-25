/**
 * 
 */
package com.atyang.librarySystem.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atyang.librarySystem.Biz.ManagerBiz;

/**
 * @���� �����
 * @����ʱ�䣺2017-6-21
 * @�������ݣ�����ҵ���߼���
 */
public class TestManagerBiz{
	private ManagerBiz mgrBiz;
	private ApplicationContext ctx;
	
	@Before
	public void TestBefore(){
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		mgrBiz = (ManagerBiz) ctx.getBean("mgrBiz");
	}
	
	/**
	 * ���Թ���Ա��׼ѧ����������
	 */
	@Test
	public void TestMgrAgreeRecordBook(){
		
		mgrBiz.agreeRecordBookById(1060002);
	}
	
	/**
	 * ���Թ���Ա��׼ѧ������
	 */
	@Test
	public void TestMgrAgreeReturnBook(){
		Integer bookNo = 1060002;
		mgrBiz.agreeReturnBookById(bookNo);
	}

}












