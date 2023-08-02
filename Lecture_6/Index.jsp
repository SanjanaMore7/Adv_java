<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Displaying Data</h1>

    <c:out value="www.p4n.in" />
    
    <p>JSTL Core Tags - c:set</p>
    
    <h1>Setting and Using a Variable</h1>

    <c:set var="message" value="Hello, World!" />

    <p><c:out value="${message}" /></p>
    
   <p> JSTL Core Tags - c:if and c:choose </p>
   
   <h1>Conditional Processing</h1>

    <c:set var="isAdmin1" value="true" />

    

   <%-- <c:if test="${isAdmin}">

        <p>Welcome, Admin!</p>

    </c:if> --%>

    <c:choose>

        <c:when test="${isAdmin}">

            <p>Welcome, Admin!</p>

        </c:when>

        <c:otherwise>

            <p>Welcome, Guest!</p>

        </c:otherwise>

    </c:choose>

    JSTL Core Tags - c:forEach
    
     <h1>Iteration</h1>

    <c:forEach var="i" begin="1" end="5">

        <p>Item ${i}</p>

    </c:forEach>
    
  
    
</body>
</html>