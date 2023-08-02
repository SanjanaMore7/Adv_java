<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to home ...</h1>
<h1>
		<%
			String n_user =  request.getParameter("name");
			String e_user =  request.getParameter("email");
			
			out.print("this is my name : "+n_user+"<br>");
			out.print("this is my Email : "+e_user+"<br>");
			String city_a =  request.getParameter("city");
			out.print("city : "+city_a+"<br>");
			
		%>
		</h1>
</body>
</html>