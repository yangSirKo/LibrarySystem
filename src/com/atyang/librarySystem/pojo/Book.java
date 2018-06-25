package com.atyang.librarySystem.pojo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Book entity. @author MyEclipse Persistence Tools
 */

public class Book implements java.io.Serializable {

	private static final long serialVersionUID = -901311183741536486L;

	//书号
	private Integer bookNo;
	//书名
	private String bookName;
	//作者
	private String auther;
	//出版社
	private String publishing;
	//出版时间
	private Date publishTime;
	//借出状态
	private String bookState;
	
	//该书的归还出情况
	private Set<Return> returns = new HashSet<Return>();
	//该书的借出情况
	private Set<Record> records = new HashSet<Record>();

	// Constructors

	/** default constructor */
	public Book() {
	}

	/** minimal constructor */
	public Book(String bookName, String auther, String bookState) {
		this.bookName = bookName;
		this.auther = auther;
		this.bookState = bookState;
	}

	/** full constructor */
	public Book(String bookName, String auther, String publishing,
			Date publishTime, String bookState, Set<Return> returns, Set<Record> records) {
		this.bookName = bookName;
		this.auther = auther;
		this.publishing = publishing;
		this.publishTime = publishTime;
		this.bookState = bookState;
		this.returns = returns;
		this.records = records;
	}

	// Property accessors

	@Override
	public String toString() {
		return "Book [bookNo=" + bookNo + ", bookName=" + bookName
				+ ", auther=" + auther + ", publishing=" + publishing
				+ ", publishTime=" + publishTime + ", bookState=" + bookState
				+ ", returns=" + returns + ", records=" + records + "]";
	}

	public Integer getBookNo() {
		return this.bookNo;
	}

	public void setBookNo(Integer bookNo) {
		this.bookNo = bookNo;
	}

	public String getBookName() {
		return this.bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuther() {
		return this.auther;
	}

	public void setAuther(String auther) {
		this.auther = auther;
	}

	public String getPublishing() {
		return this.publishing;
	}

	public void setPublishing(String publishing) {
		this.publishing = publishing;
	}

	public Date getPublishTime() {
		return this.publishTime;
	}

	public void setPublishTime(Date publishTime) {
		this.publishTime = publishTime;
	}

	public String getBookState() {
		return this.bookState;
	}

	public void setBookState(String bookState) {
		this.bookState = bookState;
	}

	public Set<Return> getReturns() {
		return this.returns;
	}

	public void setReturns(Set<Return> returns) {
		this.returns = returns;
	}

	public Set<Record> getRecords() {
		return this.records;
	}

	public void setRecords(Set<Record> records) {
		this.records = records;
	}

}