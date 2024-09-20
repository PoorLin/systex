<%@page import="java.util.Date"%>
<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath()%>/style/mystyle.css"
	rel="stylesheet">
</head>
<body>
<h2> dump jsp </h2>
<%=session.isNew() %>
<%=session.getId() %>
<%=session.getLastAccessedTime() %>
<%=new Date(session.getLastAccessedTime()) %>

	<table>
		<tbody>

			<%
			for (int a = 2; a < 10; a++) {
			%>
			<tr>
				<%
				for (int b = 1; b < 10; b++) {
				%>
				<td><%=a%>*<%=b%>=<%=a * b%></td>
				<%
				}
				%>
			</tr>
			<%
			}
			%>
		</tbody>
	</table>
	<table>
		<tbody>
         
         		<%
         		 Enumeration<String> parStr= request.getParameterNames(); %>
         		 	 <tr>
         	<% 	 while(parStr.hasMoreElements()){ 	%>
         				
         			
         			 	<%   	String string = (String) parStr.nextElement();    %>
         					 <td><%=string %>   </td>
         		 <td><%=request.getParameter(string) %>   </td>
         			 
         			 
         				<%    } %> 
         		
        
			</tr>
	
         
         
         
		</tbody>
	</table>




	<img alt="" src="<%=request.getContextPath()%>/images/chii.jpeg">
</body>
</html>