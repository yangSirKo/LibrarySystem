package com.atyang.librarySystem.pojo;

/**
 * ReturnId entity. @author MyEclipse Persistence Tools
 */

public class ReturnId implements java.io.Serializable {

	private static final long serialVersionUID = 4543614416872923076L;
	
	//还书的ID
	private Integer returnNo;
	//借书的学生用户
	private Student student;
	//借阅的书本
	private Book book;

	// Constructors

	/** default constructor */
	public ReturnId() {
	}

	/** full constructor */
	public ReturnId(Integer returnNo, Student student, Book book) {
		this.returnNo = returnNo;
		this.student = student;
		this.book = book;
	}

	// Property accessors

	public Integer getReturnNo() {
		return this.returnNo;
	}

	public void setReturnNo(Integer returnNo) {
		this.returnNo = returnNo;
	}

	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Book getBook() {
		return this.book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ReturnId))
			return false;
		ReturnId castOther = (ReturnId) other;

		return ((this.getReturnNo() == castOther.getReturnNo()) || (this
				.getReturnNo() != null && castOther.getReturnNo() != null && this
				.getReturnNo().equals(castOther.getReturnNo())))
				&& ((this.getStudent() == castOther.getStudent()) || (this
						.getStudent() != null && castOther.getStudent() != null && this
						.getStudent().equals(castOther.getStudent())))
				&& ((this.getBook() == castOther.getBook()) || (this.getBook() != null
						&& castOther.getBook() != null && this.getBook()
						.equals(castOther.getBook())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getReturnNo() == null ? 0 : this.getReturnNo().hashCode());
		result = 37 * result
				+ (getStudent() == null ? 0 : this.getStudent().hashCode());
		result = 37 * result
				+ (getBook() == null ? 0 : this.getBook().hashCode());
		return result;
	}

}