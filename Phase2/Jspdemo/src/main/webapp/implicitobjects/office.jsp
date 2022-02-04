<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
h1{
color:green;
font-Weight:500;
}
</style>
</head>
<body>
	
	<h1>This is Office Page</h1>
	
	<%= pageContext.getAttribute("userId", PageContext.APPLICATION_SCOPE) %>
	<br/>
	
	<%= session.getAttribute("UserName") %>

</body>
</html>