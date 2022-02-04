<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Jsp Demo</title>
</head>
<body>

	<h1>This is Scriptlet</h1>
	<%
	int age = 20;
	
	if(age >= 18){
		out.println("<p> Enterd Age is Valid</p>");
	}
	else{
		out.println("<p> Enterd Age is InValid</p>");
	}
	%>

</body>
</html>