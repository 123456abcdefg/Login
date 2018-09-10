<%@ page language="java" contentType="text/html; charset=utf-8"
    import="com.entity.user"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" >
<title>login</title>
<style type="text/css" >
	.table{
	 border:1px solid  #ddd;;
	 width:50%;
	border-spacing:0px;
	
}

td{
	border:1px solid #ddd;
	height:50px;
	
}

</style>

</head>
<body>

	

	
	
	<form action="userlist.action" method="post">
	
		<label>请输入id:</label>
		<input name="search" />
		<button type="submit">搜索</button>
	</form>
	
	<a href="${pageContext.request.contextPath}/admin/user/add.action">
		<button type="submit">新增</button>
	</a>
	
	
	<table  class="table" style="margin-top: 20px" >
	
	<thead>
		<tr align="center" style="font-weight: bold">
			<td>序号</td>
			<td>用户名</td>
			<td>密码</td>
			<td>ident</td>
			<td>操作</td>
		</tr>
	</thead>
	
	<tbody>
		
		<c:if test="${userlist ne null}">
			<c:forEach items="${userlist}" var="user" >
				<tr align="center">
					<td>${user.id}</td>
					<td>${user.username}</td>
					<td>${user.password}</td>
					<td>${user.ident}</td>
					
					<td>
					<a href="${pageContext.request.contextPath}/admin/user/delete_do.action?id=${user.id}">
						<button type="submit">删除</button>
					</a>
					<a href="${pageContext.request.contextPath}/admin/user/update.action?id=${user.id}">
						<button type="submit">修改</button>
					</a>
					</td>
				</tr>
			
			</c:forEach>
			
		</c:if>
	
	
	</tbody>
	
	</table>
	
	
	
	
</body>
</html>












