<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>

<html>

<head>

    <title>JSTL Core Tags - forEach Loop Example</title>

</head>

<body>

    <h1>Looping with JSTL Core forEach</h1>

	
	<%
	String[] users = new String[5];
	users[0] = "codebun";
	users[1] = "codedec";
	users[2] = "bhupi";
	users[3] = "bhuvi";
	users[4] = "raj";
	%>
	<c:forEach items="<%=users%>" var="user" >
	${user}
	<br/>
	</c:forEach>
	
	
    <%-- Sample Array of Names --%>

    <% String[] namesArray = { "Alice", "Bob", "Charlie", "David", "Eve" }; %>
    
     <%-- Loop using forEach --%>
    
    
    <%-- Loop using forEach --%>
<%
    for (String name : namesArray) {
%>
    <p>Hello, <%= name %>!</p>
<%
    }
%>
	
	

</body>

</html>