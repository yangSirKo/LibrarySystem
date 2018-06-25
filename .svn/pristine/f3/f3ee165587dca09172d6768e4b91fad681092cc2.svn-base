/**
 * 
 */
package com.atyang.librarySystem.action;

import static com.atyang.librarySystem.Biz.BaseFinal.LOGIN_MGR;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.atyang.librarySystem.pojo.Manager;

/**
 * @作者 杨金鹏
 * @创建时间：2017-6-21
 * @创建内容：
 */
@Scope("prototype")
@Controller("managerAction")
public class ManagerAction extends BaseAction<Manager> {

	// 处理管理员登录
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

	// 查看所有借书申请
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

	// 审核申请
	public String AuditRecordApply() {
		if (bookState.equals("借书待审核")) {
			mgrBiz.agreeRecordBookById(bookNo);
		} else {
			mgrBiz.agreeReturnBookById(bookNo);
		}
		return "success";
	}

	/*
	 * //批复借书申请 public void agreeRecordBookApply(){
	 * mgrBiz.agreeRecordBookById(bookNo); }
	 * 
	 * //批复借书申请 public void agreeReturnBookApply(){
	 * 
	 * }
	 */
}
