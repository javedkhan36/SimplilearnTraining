<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Implicit Objects</title>
</head>
<body>

	<%
		String office = request.getParameter("office");
		
		if(office != null){
			response.sendRedirect("office.jsp");	
		}
		else{
			out.print("office not availabe");
		}
		
		out.println("<br/>this is OUT implicit-object, which will print context to PrintWriter");
		
		out.println("<br/> Server Name: "+ request.getServerName());
		out.println("<br/> Port Number:"+ request.getServerPort());
		
		out.println("<p>Page name is:"+page.toString());
		out.print("<br/>");
		
		pageContext.setAttribute("userId", "AI4220", PageContext.APPLICATION_SCOPE);
		pageContext.setAttribute("UserName", "javed", PageContext.REQUEST_SCOPE);
		
		session.setAttribute("UserName", "javed");
		
	%>
	<br>
	<a href="implicit-objects.jsp?office=test">Click here to redirect office</a>

</body>
</html>