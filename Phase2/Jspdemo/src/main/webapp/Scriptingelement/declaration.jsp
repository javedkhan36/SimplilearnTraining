<%@page import="com.simplilearn.util.Sample"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Jsp Demo</title>
</head>
<body>

	<h1>This is Declaration </h1>
	<%!
		int rank = 10;
		double price = 848.04;
		String name = "javed khan";
		
		private int displayRank() {
			
			return rank;
		}		
	%>
	
	The rank is:
	<%= rank %>
	
	<br> <br> The displayRank() value is:
	<%= displayRank() %>
	<br/> <br>
	<%= Sample.displayMsg(":  hi how are you!!") %>
	

</body>
</html>