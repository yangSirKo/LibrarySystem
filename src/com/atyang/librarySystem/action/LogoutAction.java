/**
 * 
 */
package com.atyang.librarySystem.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @作者 杨金鹏
 * @创建时间：2017-6-22
 * @创建内容：
 */
@Controller("logoutAction")
public class LogoutAction extends ActionSupport implements ServletRequestAware{


	private static final long serialVersionUID = 1L;

	private HttpServletRequest request;
	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}
	
	public String execute(){
		HttpSession session = request.getSession();
		//使session失效
		session.invalidate();
		return SUCCESS;
	}

	
	
}
