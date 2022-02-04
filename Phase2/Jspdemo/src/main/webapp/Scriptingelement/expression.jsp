<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Jsp Demo</title>
<style>
h1{
	color:red;
}
</style>
</head>
<body>

	<h1>This is Expression  </h1>
	
	<%= new Date() %>

</body>
</html>