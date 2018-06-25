<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>学生登录主页</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
    
    <s:form action="stuMain.action" method="post">
    
    	<table>
    		<tr>	
    			<td>
    				<s:textfield name="stuNo" id="user" label="用户名"></s:textfield>
    			</td>
    		</tr>
    		<tr>	
    			<td>
				  <s:submit value="提交" theme="simple"></s:submit>
				  <s:reset value="重置" theme="simple"/>
	 		 	</td>
    		</tr>
	  	</table>
    </s:form>
    
  
  </body>
</html>
