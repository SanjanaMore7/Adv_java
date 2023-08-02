<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%




 String Quesion01= request.getParameter("Q1");
if (Quesion01.equals ("b"))
{
    out.print("<script> window.open('answer.jsp')</script><h1>Correct answer!<h1>"); 
}
else {
    out.print("Wrong answer. Try again next time.");
    return;
}


String Quesion02 = request.getParameter("Q2");
if (Quesion02.equals ("b")) 
{
	out.print("<script> window.open('Home.jsp')</script><h1>Correct answer!<h1>"); 
	
}
else {
    out.print("Wrong answer. Try again next time.");
    return;
}

String Quesion03 = request.getParameter("Q3");
if (Quesion03.equals("a")) 
{
	out.print("<script> window.open('answer.jsp')</script><h1>Correct answer!<h1>"); 
	
}
else {
    out.print("Wrong answer. Try again next time.");
    return;
}
out.println("MCQ Exam completed.<script> window.open('answer.jsp')</script>");

%>


    