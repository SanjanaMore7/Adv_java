<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
		<%
			String user_name = request.getParameter("user");
		    String user_pwd = request.getParameter("pwd");
		    //out.print(user_name);
		    
		    if(user_name.equals("admin") && user_pwd.equals("password")){
		    	out.print("<script> window.open('Home.jsp') </script>");
		    }else{
		    	out.print("<script> alert('try again...');</script>");
		    }
		%>