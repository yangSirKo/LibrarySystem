/**
 * 
 */
package com.atyang.librarySystem.action;

import static com.atyang.librarySystem.Biz.BaseFinal.LOGIN_STU;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.atyang.librarySystem.pojo.Book;
import com.atyang.librarySystem.pojo.RecordId;
import com.atyang.librarySystem.pojo.ReturnId;
import com.atyang.librarySystem.pojo.Student;

/**
 * @作者 杨金鹏
 * @创建时间：2017-6-21
 * @创建内容：
 */
@Scope("prototype")
@Controller("studentAction")
@SuppressWarnings("unused")
public class StudentAction extends BaseAction<Student> {

	private static final long serialVersionUID = 1L;
	private static int ReturnNo = 10001;
	private static int RecordNo = 10001;
	private RecordId recordId;
	private ReturnId returnId;

	// 处理ReturnNo 自增的方法
	public static Integer selfAddRecordNo() {
		RecordNo = (RecordNo++);
		return RecordNo;
	}

	public String execute() {
		return "success";
	}

	// 处理学生登录,, 若登录成功，则返回查询的所有图书
	public String stuLogin() {

		int loginNo = stuBiz.loginStuById(model.getStuNo()); // 登录
		if (loginNo == LOGIN_STU) {
			request.put("books", stuBiz.getAllBook());
			session.put("stuNo", model.getStuNo());
			return "success";
		} else {
			return "error";
		}
	}

	public void prepareStuLogin() {
		model = new Student();
	}

	private Integer bookNo;

	public void setBookNo(Integer bookNo) {
		this.bookNo = bookNo;
	}

	// 学生申请借书
	public String stuApplyRecordBook() {
		try {
			Student stu = new Student();
			stu.setStuNo((Integer) session.get("stuNo"));

			Book book = new Book();
			book.setBookNo(bookNo);

			recordId.setStudent(stu);
			recordId.setBook(book);

			stuBiz.applyRecord(recordId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "success";
	}

	public void prepareStuApplyRecordBook() {
		recordId = new RecordId();
		recordId.setRecordNo(StudentAction.selfAddRecordNo()); // 自增借书序号
	}

	// 查询所有书
	public String getBooks() {
		request.put("books", stuBiz.getAllBook());
		return "success";
	}

	private Integer stuNo;

	public void setStuNo(Integer stuNo) {
		this.stuNo = stuNo;
	}

	// 查询学生所借的书
	public String stuRecordSuccess() {
		request.put("stuBooks",
				stuBiz.getStuRecordBooks((Integer) session.get("stuNo")));
		return "success";
	}

	// 处理学生还书申请
	public String stuApplyReturnBook() {
		Student stu = new Student();
		stu.setStuNo((Integer) session.get("stuNo"));

		Book book = new Book();
		book.setBookNo(bookNo);

		returnId.setStudent(stu);
		returnId.setBook(book);

		stuBiz.applyReturnBook(returnId);
		return "success";
	}

	public void prepareStuApplyReturnBook() {
		returnId = new ReturnId();
		returnId.setReturnNo(++ReturnNo);
	}
}
