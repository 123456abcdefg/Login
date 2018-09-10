<%@ page language="java" contentType="text/html; charset=utf-8"
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" >
<title>index</title>


</head>
<body>

	<c:if test="${user.id==null }">
		<form method="post" action="add_do.action">
	</c:if>
	
	<c:if test="${user.id!=null }">
		<form method="post" action="update_do.action">
	</c:if>
	 
	 	
		<input  type="hidden" name="id" value="${user.id }"/></br>
	 
		<lable />请输入用户名：</br>
		<input  type="text" name="username" value="${user.username }"/></br>
		
		<lable />请输入密码：</br>
		<input  type="text" name="password" value="${user.password }"/></br>
		
		<lable />请输入ident：</br>
		<input  type="text" name="ident" value="${ user.ident}"/></br>
		
		<p ><button type="submit" ><B>提交 </B></button></p>

		<button type="reset" onclick="javascript: history.back(-1)"><B>返回 </B></button></br>

		
	</form>


</body>
</html>