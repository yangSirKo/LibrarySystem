package com.atyang.librarySystem.pojo;

import java.util.Date;

/**
 * Record entity. @author MyEclipse Persistence Tools
 */

public class Record implements java.io.Serializable {

	private static final long serialVersionUID = 2998844981785871818L;
	
	//id由3个字段组成，所以被单独映射为一个类。在配置文件里进行引用
	//借阅ID
	private RecordId id;
	//借阅时间
	private Date recordTime;

	// Constructors

	/** default constructor */
	public Record() {
	}

	/** full constructor */
	public Record(RecordId id, Date recordTime) {
		this.id = id;
		this.recordTime = recordTime;
	}

	// Property accessors

	public RecordId getId() {
		return this.id;
	}

	public void setId(RecordId id) {
		this.id = id;
	}

	public Date getRecordTime() {
		return this.recordTime;
	}

	public void setRecordTime(Date recordTime) {
		this.recordTime = recordTime;
	}

}