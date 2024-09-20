<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage = "error/error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <%!  int a = 100;  %>
   <%   int a = 500; %>
   
   A = <%=a/0 %>
       <br>
   Current Time = <%= SimpleDateFormat.getInstance().format(new Date())  %>
    <%  //123 %>
    <%-- test123 --%>
        <br>
    User Agent = <%= request.getHeader("User-Agent") %>
    <br>



</body>
</html>