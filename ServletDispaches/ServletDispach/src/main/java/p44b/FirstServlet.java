package p44b;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


import java.io.*;

public class FirstServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>FirstServlet</h1>");
        out.println("<p>We are a company that...</p>");
        out.close();
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>FirstServlet</h1>");
        out.println("<p> welcome to Home ...</p>");
        out.close();
    }
}