<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>管理员主页</title>
    
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
  	<center>
  	<a href="stuWaitBooks">查看待处理申请</a>  &nbsp;&nbsp;&nbsp; <a href="logout.action">退出</a>
    <table border="1" width="780">
    	<tr  height="24">
    		<td>书号</td>
    		<td>书名</td>
    		<td>作者</td>
    		<td>出版社</td>
    		<td>出版时间</td>
    		<td>图书状态</td>
    	</tr>
    	<s:iterator value="#request.books" id="book" status="index">
    		<s:if test="#index.odd == true">
				<tr style="background-color: #cccccc" height="24">
			</s:if>
			<s:else>
			 	<tr height="24">
			</s:else>
			   		<td>${bookNo }</td>
			   		<td>${bookName }</td>
			   		<td>${auther }</td>
			   		<td>${publishing}</td>
			   		<td>${publishTime}</td>
			   		<td>${bookState}</td>
		   		</tr>
    	</s:iterator>
    </table>
    </center>
  </body>
</html>
