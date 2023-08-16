package p4n.in;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import java.io.*;

/**
 * Servlet implementation class ConfigServlet
 */
public class ConfigServlet extends HttpServlet {
	public void init(ServletConfig config) throws ServletException {
        super.init(config);
        
        // Get the ServletContext
        ServletContext context = getServletContext();
        
        // Set a configuration parameter
        context.setAttribute("databaseUrl", "jdbc:mysql://localhost:3306/mydb");
        context.setAttribute("maxConnections", 10);
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Configuration Set</h1>");
        out.close();
    }
}
       
    