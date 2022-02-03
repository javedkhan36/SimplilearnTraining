<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>This is 1st page</h1>

<jsp:forward page="mak.jsp">
	<jsp:param value="Simplilearn" name="name"/>
</jsp:forward>

</body>
</html>