package com.atyang.librarySystem.pojo;

import java.util.Date;

/**
 * Return entity. @author MyEclipse Persistence Tools
 */

public class Return implements java.io.Serializable {

	private static final long serialVersionUID = -2694307456495829255L;

	//还书的Id
	private ReturnId id;
	//还书的时间
	private Date returnTime;

	// Constructors

	/** default constructor */
	public Return() {
	}

	/** full constructor */
	public Return(ReturnId id, Date returnTime) {
		this.id = id;
		this.returnTime = returnTime;
	}

	// Property accessors

	public ReturnId getId() {
		return this.id;
	}

	public void setId(ReturnId id) {
		this.id = id;
	}

	public Date getReturnTime() {
		return this.returnTime;
	}

	public void setReturnTime(Date returnTime) {
		this.returnTime = returnTime;
	}

}