<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="style/mystyle.css" rel="stylesheet">
<link>
<title>Welcome</title>
</head>
<body>

	<h1>Welcome To My Java EE Playground</h1>
	<p>
		current Time is
		<%=SimpleDateFormat.getInstance().format(new Date())%>>
	</p>
	<p>
		<a href="admin/hello.aspx">Hello Servlet</a>
	</p>
	<p>
		<a href="customer/createCustomer1.jsp">測試交談時期</a>
	</p>
</body>
</html>