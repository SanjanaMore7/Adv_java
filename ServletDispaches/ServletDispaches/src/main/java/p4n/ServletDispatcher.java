package p4n;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import java.io.*;

public class ServletDispatcher extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = request.getServletPath();
        
        if ("/home".equals(path)) {
            request.getRequestDispatcher("/homeServlet").forward(request, response);
        } else if ("/about".equals(path)) {
            request.getRequestDispatcher("/aboutServlet").forward(request, response);
        } else {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<h1>Error: Page not found</h1>");
            out.close();
        }
    }
}
