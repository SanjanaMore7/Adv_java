<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String Quesion01 = request.getParameter("Q1");
	out.print(Quesion01);
	out.print(" program in the execution <br>");
	String Quesion02 = request.getParameter("Q2");
	out.print(Quesion02);
	out.print(" Spell checker <br>");
	String Quesion03 = request.getParameter("Q3");
	out.print(Quesion03);
	out.print(" A bit<br>");
	%>
</body>
</html>