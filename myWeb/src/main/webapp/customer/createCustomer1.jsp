<%@page import="java.util.Set"%>
<%@page import="java.util.HashSet"%>
<%@page import="java.util.LinkedList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="/myWeb/style/mystyle.css" rel="stylesheet">
</head>
<body>

	<h1>新增顧客</h1>

	<%-- Error report --%>
	<%
	LinkedList<String> errors = (LinkedList<String>) request.getAttribute("errors");
	%>
	<%
	if (errors != null) {
	%>
	<div style="margin-left: 40%;">
		<ul>
			<%
			for (String error : errors) {
			%>
			<li style="color: red"><%=error%></li>

			<%
			}
			%>
		</ul>



		<%
		}
		%>
	</div>


	<table>
		<form action="createCustomer.do" method="post">
		<input type="hidden" name="action" value="cc1">
			<tr>
				<td>姓名</td>
				<td><input type="name" name="name" value="${param.name}"></td>
			</tr>
			<tr>
				<td>電郵</td>
				<td><input type="email" name="email" value="${param.email}"></td>

			</tr>
			<tr>
				<td>電話</td>
				<td><input type="tel" name="telephone"
					value="${param.telephone}"></td>

			</tr>
			<tr>
				<td>地址</td>
				<td><input type="text" name="address" value="${param.address}"></td>

			</tr>
			
			<tr>
				<td></td>
				<td><input type="reset"> <input type="submit"
					value="新增"></td>
			</tr>



		</form>
	</table>




</body>
</html>