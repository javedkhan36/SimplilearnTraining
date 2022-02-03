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
	
	<%
		boolean isFound = false;
			Cookie [] ck1 = request.getCookies();
			
			
			for(Cookie c: ck1){
				if(c.getName().equals("email")){
					out.println("<h2 style='color:green; text-align:center'>Hello User " +c.getValue()+"</h2>");
					isFound = true;
				}
			}
			
			if (!isFound) {
				throw new ServletException(" Invalid user access, please login again");
			}
	
	%>
	
	<jsp:include page="footer.jsp"></jsp:include>

</body>
</html>