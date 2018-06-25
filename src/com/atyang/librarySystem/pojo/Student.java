package com.atyang.librarySystem.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * Student entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings("rawtypes")
public class Student implements java.io.Serializable {
	private static final long serialVersionUID = -7648557589987417191L;
	
	//学号
	private Integer stuNo;
	//学生姓名
	private String stuName;
	//学生性别
	private String stuSex;
	//学生班级
	private String department;
	//学生所在系
	private String class_;
	//学生联系方式
	private String phone;
	
	//学生还书情况
	private Set<Return> returns = new HashSet<Return>();
	//学生借书信息
	private Set<Record> records = new HashSet<Record>();

	// Constructors

	/** default constructor */
	public Student() {
	}

	/** minimal constructor */
	public Student(String stuName, String stuSex, String department,
			String class_, String phone) {
		this.stuName = stuName;
		this.stuSex = stuSex;
		this.department = department;
		this.class_ = class_;
		this.phone = phone;
	}

	/** full constructor */
	public Student(String stuName, String stuSex, String department,
			String class_, String phone, Set<Return> returns, Set<Record> records) {
		this.stuName = stuName;
		this.stuSex = stuSex;
		this.department = department;
		this.class_ = class_;
		this.phone = phone;
		this.returns = returns;
		this.records = records;
	}

	// Property accessors

	public Integer getStuNo() {
		return this.stuNo;
	}

	public void setStuNo(Integer stuNo) {
		this.stuNo = stuNo;
	}

	public String getStuName() {
		return this.stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getStuSex() {
		return this.stuSex;
	}

	public void setStuSex(String stuSex) {
		this.stuSex = stuSex;
	}

	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getClass_() {
		return this.class_;
	}

	public void setClass_(String class_) {
		this.class_ = class_;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Set getReturns() {
		return this.returns;
	}

	public void setReturns(Set<Return> returns) {
		this.returns = returns;
	}

	public Set getRecords() {
		return this.records;
	}

	public void setRecords(Set<Record> records) {
		this.records = records;
	}

	@Override
	public String toString() {
		return "Student [stuNo=" + stuNo + ", stuName=" + stuName + ", stuSex="
				+ stuSex + ", department=" + department + ", class_=" + class_
				+ ", phone=" + phone + ", returns=" + returns + ", records="
				+ records + "]";
	}

}