/**
 * 
 */
package com.atyang.librarySystem.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atyang.librarySystem.Biz.StudentBiz;
import com.atyang.librarySystem.pojo.Book;
import com.atyang.librarySystem.pojo.RecordId;
import com.atyang.librarySystem.pojo.ReturnId;
import com.atyang.librarySystem.pojo.Student;

/**
 * @���� �����
 * @����ʱ�䣺2017-6-21
 * @�������ݣ�����ҵ���߼���
 */
public class TestStudentBiz{
	private StudentBiz stuBiz;
	private ApplicationContext ctx;
	
	@Before
	public void TestBefore(){
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		stuBiz = (StudentBiz) ctx.getBean("stuBiz");
	}
	
	/**
	 * ����ѧ���������
	 */
	@Test
	public void TestStuRecordBook(){
		RecordId recordId = new RecordId();
		recordId.setRecordNo(10002);
	
		Book book = new Book();
		book.setBookNo(1060002);
		recordId.setBook(book);
		
		Student stu = new Student();
		stu.setStuNo(20170003);
		recordId.setStudent(stu);
		
		stuBiz.applyRecord(recordId);
		
	}
	
	/**
	 * ����ѧ�����뻹��
	 */
	@Test
	public void TestStuApplyReturnBook(){
		ReturnId returnId = new ReturnId();
		returnId.setReturnNo(10002);
	
		Book book = new Book();
		book.setBookNo(1060002);
		returnId.setBook(book);
		
		Student stu = new Student();
		stu.setStuNo(20170003);
		returnId.setStudent(stu);
		
		stuBiz.applyReturnBook(returnId);
		
	}
	
}











