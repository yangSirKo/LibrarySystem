package com.atyang.librarySystem.pojo;

import java.util.Date;

/**
 * Record entity. @author MyEclipse Persistence Tools
 */

public class Record implements java.io.Serializable {

	private static final long serialVersionUID = 2998844981785871818L;
	
	//id��3���ֶ���ɣ����Ա�����ӳ��Ϊһ���ࡣ�������ļ����������
	//����ID
	private RecordId id;
	//����ʱ��
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