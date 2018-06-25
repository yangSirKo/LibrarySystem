package com.atyang.librarySystem.pojo;

/**
 * Manager entity. @author MyEclipse Persistence Tools
 */

public class Manager implements java.io.Serializable {

	private static final long serialVersionUID = 5427170592632234804L;
	
	//����Ա�˺�
	private Integer mgrNo;
	//����Ա��ϵ��ʽ
	private String phone;
	//����Ա����
	private String password;

	// Constructors

	/** default constructor */
	public Manager() {
	}

	/** full constructor */
	public Manager(String phone, String password) {
		this.phone = phone;
		this.password = password;
	}

	// Property accessors

	public Integer getMgrNo() {
		return this.mgrNo;
	}

	public void setMgrNo(Integer mgrNo) {
		this.mgrNo = mgrNo;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Manager [mgrNo=" + mgrNo + ", phone=" + phone + ", password="
				+ password + "]";
	}
	

}