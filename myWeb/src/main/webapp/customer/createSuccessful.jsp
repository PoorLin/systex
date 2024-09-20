<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>create successful</title>
<link href="/myWeb/style/mystyle.css" rel="stylesheet">
</head>
<body>
	<h2>顧客資料建立成功</h2>
	<table>
		<tr>
			<td>姓名</td>
			<td>${ cust.name }</td>
		</tr>

		<tr>
			<td>電郵</td>
			<td>${ cust.email }</td>
		</tr>
		<tr>
			<td>電話</td>
			<td>${ cust.telephone }</td>
		</tr>
		<tr>
			<td>地址</td>
			<td>${ cust.address }</td>
		</tr>
		<tr>
			<td>生日</td>
			<td>${ cust.birth }</td>
		</tr>
		<tr>
			<td>性別</td>
			<td>${ cust.gender }</td>
		</tr>
		<tr>
			<td>嗜好</td>
			<td>${ cust.habitString }</td>
		</tr>


	</table>
<a href="<%=request.getContextPath()%>/index.jsp\" ><img src ="<%=request.getContextPath()%>/images/chii.jpeg"> </a>

</body>
</html>