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
 * @作者 杨金鹏
 * @创建时间：2017-6-21
 * @创建内容：测试业务逻辑层
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
	 * 测试管理员批准学生借书申请
	 */
	@Test
	public void TestMgrAgreeRecordBook(){
		
		mgrBiz.agreeRecordBookById(1060002);
	}
	
	/**
	 * 测试管理员批准学生还书
	 */
	@Test
	public void TestMgrAgreeReturnBook(){
		Integer bookNo = 1060002;
		mgrBiz.agreeReturnBookById(bookNo);
	}

}












