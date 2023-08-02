<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String user_pwd = request.getParameter("pwd");
if(user_pwd.equals("12345")){
	out.print("<script> window.open('Home.jsp') </script>");
}else{
	out.print("<script> alert('try again...') </script>");
}
%>




