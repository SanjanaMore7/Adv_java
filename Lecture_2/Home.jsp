<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>
<%
String S_user=request.getParameter("salutation");
String F_name=request.getParameter("firstName");
String L_name=request.getParameter("lastName");
String g_user=request.getParameter("gender");
String E_user=request.getParameter("email");
String B_user=request.getParameter("birthDate");
String A_user=request.getParameter("address");
out.print("This is a Salutation:"+S_user+"<br>");
out.print("This is My firstName :"+F_name+"<br>");
out.print("This is My lastName :"+L_name+"<br>");
out.print("This is My gender :"+g_user+"<br>");
out.print("This is My Email:"+E_user+"<br>");
out.print("This is My birthDate:"+B_user+"<br>");
out.print("This is My address:"+A_user+"<br>");


%>


</h1>
</body>
</html>