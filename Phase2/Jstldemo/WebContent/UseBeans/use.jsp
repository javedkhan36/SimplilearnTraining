<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<jsp:useBean id="product" class="com.simplilearn.entity.Menu" scope="session"></jsp:useBean>
	
	<jsp:setProperty property="id" name="product" value="${100 }"/>
	<jsp:setProperty property="name" name="product" value="student"/>
	<jsp:setProperty property="price" name="product" value="5000"/>
	<jsp:setProperty property="description" name="product" value="Simplilearn is best platform "/>
	
	<a href="show.jsp">Click here to View bean display</a><br>
</body>
</html>