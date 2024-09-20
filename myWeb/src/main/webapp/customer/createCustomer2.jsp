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
				<input type="hidden" name="action" value="cc2">
			
			<tr>
				<td>生日</td>
				<td><input type="date" name="birth" value="${param.birth}"></td>

			</tr>

			<tr>
				<td>性別</td>
				<td><label>男</label> <%
 String gender = request.getParameter("gender");
 %> <input type="radio" name="gender" value="male"
					<%=("male".equals(gender)) ? "checked" : ""%>> <label>女</label>
					<input type="radio" name="gender" value="female"
					<%=("female".equals(gender)) ? "checked" : ""%>></td>

			</tr>

			<tr>
				<%
				String[] habits = request.getParameterValues("habit");
				Set<String> set = new HashSet<String>();
				if (habits != null) {
					for (String habit : habits) {
						set.add(habit);
					}
				}
				%>
				<td>嗜好</td>
				<td><label>聽音樂</label> <input type="checkbox" name="habit"
					value="music" <%=(set.contains("music")) ? "checked" : ""%>>
					<label>逛街</label> <input type="checkbox" name="habit"
					value="shopping" <%=(set.contains("shopping")) ? "checked" : ""%>>
					<label>讀書</label> <input type="checkbox" name="habit"
					value="reading" <%=(set.contains("reading")) ? "checked" : ""%>></td>

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