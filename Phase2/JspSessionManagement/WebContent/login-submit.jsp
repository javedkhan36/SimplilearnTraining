<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<jsp:include page="header.jsp"></jsp:include>
	
	<%
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		if(email == null || password == null || email.equals("") || password.equals("") ){
			throw new ServletException(":: Mandatory Parameters are missing ::");
		}
		else{
			if(email.equals("javedkhan14@gmail.com") && password.equals("3178")){
				
				Cookie ck = new Cookie("userId","123");
				Cookie ck2 = new Cookie("email",email);
				
				response.addCookie(ck);
				response.addCookie(ck2);
				
				out.println("<h2 style='color:green'> Successfully Logged in !</h2>"); 
				
			}
			else{
				throw new ServletException(":: Invalid Credentials::");
			}
			
		}
	%>
	<jsp:include page="footer.jsp"></jsp:include>

</body>
</html>