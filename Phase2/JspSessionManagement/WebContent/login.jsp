<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	
	<form action="login-submit.jsp" method="post">
	<fieldset>
	<legend>Login Form</legend>
	<br>
	User Email: <input type="text" name="email" id="email"> <br>
	User Password: <input type="password" name="password" id="password"> <br>
	
	<input type="submit" value="Login">
	</fieldset>
	
	</form>
	
	<jsp:include page="footer.jsp"></jsp:include>

</body>
</html>