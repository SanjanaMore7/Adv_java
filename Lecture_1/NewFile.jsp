<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel ="stylesheet" href="./css/Style.css">
</head>
<body>
<h1>Introduction...</h1>
<p>JSP=Java Server Page...</p>
<%
int a=100;
out.print("<h1>"+"welcome"+"</h1>");
out.print(a);

%>
 
<%=
800+900

%>
<%!
String info(){
	return "p4n.in";
	
}
%>
<%
out.print(info());

%>
<ol>
|<%
for(int i=0;i<=10;i++){
	out.print ("<li>"+info()+"</li>");
	
}

%>

</ol>


</body>
</html>