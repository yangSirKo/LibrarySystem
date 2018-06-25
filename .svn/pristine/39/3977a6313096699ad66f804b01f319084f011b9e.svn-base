/**
 * 
 */
package com.atyang.librarySystem.action;

import java.lang.reflect.ParameterizedType;
import java.util.Map;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;

import com.atyang.librarySystem.Biz.ManagerBiz;
import com.atyang.librarySystem.Biz.StudentBiz;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

/**
 * @作者 杨金鹏
 * @创建时间：2017-6-21
 * @创建内容：
 */
@SuppressWarnings("all")
@Controller
@Lazy
public class BaseAction<T> implements ModelDriven<T>,SessionAware,RequestAware,ApplicationAware,Preparable {

	// 访问修饰符为：protected ， 提供给子类使用 
	protected T model;
	
	/**
	 * 获取子类泛型中的类
	 */
	public BaseAction(){
		ParameterizedType type = (ParameterizedType) this.getClass().getGenericSuperclass();
		Class clazz = (Class) type.getActualTypeArguments()[0];
		try {
			model = (T) clazz.newInstance();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public T getModel() {
		return model;
	}
	
	// biz 的注入
	@Autowired  @Qualifier("mgrBiz")
	protected ManagerBiz mgrBiz;

	@Autowired  @Qualifier("stuBiz") 
	protected StudentBiz stuBiz;

	public void setMgrBiz(ManagerBiz mgrBiz) {
		this.mgrBiz = mgrBiz;
	}

	public void setStuBiz(StudentBiz stuBiz) {
		this.stuBiz = stuBiz;
	}

	//作用域对象的获取
	protected Map<String, Object> application;
	@Override
	public void setApplication(Map<String, Object> arg0) {
		this.application = arg0;
	}

	protected Map<String, Object> request;
	@Override
	public void setRequest(Map<String, Object> arg0) {

		this.request = arg0;
	}
	
	protected Map<String, Object> session;
	@Override
	public void setSession(Map<String, Object> arg0) {

		this.session = arg0;
	}

	
	@Override
	public void prepare() throws Exception {   }
	
	
}
