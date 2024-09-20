<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true"%>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>this is a error handling page</title>
</head>
<body style = "background:orange">
   <h1>
   this is a error handling page
   Root Cause : <%= exception.getMessage() %> </h1>
</body>
</html>