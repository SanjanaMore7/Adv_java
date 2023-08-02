<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>  

<body>  

<%   
String name=request.getParameter("uname");  
out.print("Welcome "+name);  
session.setAttribute("user",name);    
%>  
<a href="Second.jsp">second jsp page</a>  

</body>  

</html>  