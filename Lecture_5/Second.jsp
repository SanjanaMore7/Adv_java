<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>  

<body>  

<%   

  

String name=(String)session.getAttribute("user");  

out.print("Hello "+name);  

Cookie c = new Cookie(name,"qwerty");

response.addCookie(c);

  

%>  

</body>  

</html> 