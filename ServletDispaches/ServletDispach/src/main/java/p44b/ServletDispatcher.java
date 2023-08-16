package p44b;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.*;

public class ServletDispatcher extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = request.getServletPath();
        
        if ("/first".equals(path)) {
        	response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<h1>FirstServlet</h1>");
            out.close();
            request.getRequestDispatcher("/FirstServlet").forward(request, response);
        } else if ("/second".equals(path)) {
        	response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<p>We are a company that...</p>");
            out.close();
            request.getRequestDispatcher("/SecondServlet").forward(request, response);
        } else {
        	response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<h1>Error: Page not found</h1>");
            out.close();
        }
    }
}