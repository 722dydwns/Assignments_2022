<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>LoginCheck </h1> 	
	<% 
		String id = (String) request.getAttribute("id");
		if (id != null)
			out.println("<p> Welcome " + id+ "</p>") ;
		else 
			out.println("<p> Wrong ID/PWD </p>");
	  %>
</body>
</html>