/**
 * 
 */
package com.atyang.librarySystem.Biz;

/**
 * @作者 杨金鹏
 * @创建时间：2017-6-20
 * @创建内容：存放静态常量
 */
public interface BaseFinal {

	//登录失败    // fail:失败
	public static final int LOGIN_FAIL = 0;  
	//以普通员工身份登录
	public static final int LOGIN_STU = 1;
	//以经理身份登录
	public static final int LOGIN_MGR = 2;
	
	//定义一个静态变量
//	public static int RecordOrReturn = 10001;  //在具体的类中定义，用来标记借书或还书的号码
	
}
