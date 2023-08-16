package p4n.in;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import java.io.*;

public class InfoServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get the ServletContext
        ServletContext context = getServletContext();
        
        // Access the configuration parameters
        String databaseUrl = (String) context.getAttribute("databaseUrl");
        int maxConnections = (int) context.getAttribute("maxConnections");
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Database URL: " + databaseUrl + "</h1>");
        out.println("<p>Max Connections: " + maxConnections + "</p>");
        out.close();
    }
}
