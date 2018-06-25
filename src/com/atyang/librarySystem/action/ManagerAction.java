/**
 * 
 */
package com.atyang.librarySystem.action;

import static com.atyang.librarySystem.Biz.BaseFinal.LOGIN_MGR;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.atyang.librarySystem.pojo.Manager;

/**
 * @���� �����
 * @����ʱ�䣺2017-6-21
 * @�������ݣ�
 */
@Scope("prototype")
@Controller("managerAction")
public class ManagerAction extends BaseAction<Manager> {

	// �������Ա��¼
	public String mgrLogin() {

		session.put("mgrNo", model.getMgrNo());
		session.put("mgrPass", model.getPassword());
		int loginNo = mgrBiz.loginMgr(model.getMgrNo(), model.getPassword());
		if (loginNo == LOGIN_MGR) {
			request.put("books", mgrBiz.getAllBook());
			return "success";
		} else {
			return "error";
		}
	}

	public void prepareMgrLogin() {
		model = new Manager();
	}

	// �鿴���н�������
	public String getStuWaitBooks() {
		request.put("books", mgrBiz.getWaitBook());
		return "success";
	}

	private Integer bookNo;

	public void setBookNo(Integer bookNo) {
		this.bookNo = bookNo;
	}

	private String bookState;

	public void setBookState(String bookState) {
		this.bookState = bookState;
	}

	// �������
	public String AuditRecordApply() {
		if (bookState.equals("��������")) {
			mgrBiz.agreeRecordBookById(bookNo);
		} else {
			mgrBiz.agreeReturnBookById(bookNo);
		}
		return "success";
	}

	/*
	 * //������������ public void agreeRecordBookApply(){
	 * mgrBiz.agreeRecordBookById(bookNo); }
	 * 
	 * //������������ public void agreeReturnBookApply(){
	 * 
	 * }
	 */
}
