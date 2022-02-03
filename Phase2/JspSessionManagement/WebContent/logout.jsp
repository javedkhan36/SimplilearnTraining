<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	Cookie ck = new Cookie("email","");
	
	ck.setMaxAge(0);
	response.addCookie(ck);
	
	%>
	
	User Successfully Logged out.
	Click <a href="login.jsp">here</a> to goback Login Page.

</body>
</html>