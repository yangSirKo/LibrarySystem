package com.atyang.librarySystem.pojo;

/**
 * ��ϱ�ʶ����
 * 
 * ��������������ӳ����Ķ������Ϊ��ʶ����
 * <composite-id>Ԫ�ؽ���<key-property> ����ӳ���<key-many-to-one>����ӳ����Ϊ��Ԫ�ء� 
 * ���������������ڵĳ־û������ʵ�� Serializable�ӿڣ���д equals�� hashCode����
 * 
 */

public class RecordId implements java.io.Serializable {

	private static final long serialVersionUID = -5275999040916031189L;

	//���ĺ�
	private Integer recordNo;
	//���ĵ���
	private Book book;
	//��Լ��ѧ���û�
	private Student student;

	// Constructors

	/** default constructor */
	public RecordId() {
	}

	/** full constructor */
	public RecordId(Integer recordNo, Book book, Student student) {
		this.recordNo = recordNo;
		this.book = book;
		this.student = student;
	}

	// Property accessors

	public Integer getRecordNo() {
		return this.recordNo;
	}

	public void setRecordNo(Integer recordNo) {
		this.recordNo = recordNo;
	}

	public Book getBook() {
		return this.book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof RecordId))
			return false;
		RecordId castOther = (RecordId) other;

		return ((this.getRecordNo() == castOther.getRecordNo()) || (this
				.getRecordNo() != null && castOther.getRecordNo() != null && this
				.getRecordNo().equals(castOther.getRecordNo())))
				&& ((this.getBook() == castOther.getBook()) || (this.getBook() != null
						&& castOther.getBook() != null && this.getBook()
						.equals(castOther.getBook())))
				&& ((this.getStudent() == castOther.getStudent()) || (this
						.getStudent() != null && castOther.getStudent() != null && this
						.getStudent().equals(castOther.getStudent())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getRecordNo() == null ? 0 : this.getRecordNo().hashCode());
		result = 37 * result
				+ (getBook() == null ? 0 : this.getBook().hashCode());
		result = 37 * result
				+ (getStudent() == null ? 0 : this.getStudent().hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "RecordId [recordNo=" + recordNo + ", book=" + book
				+ ", student=" + student + "]";
	}
	
}