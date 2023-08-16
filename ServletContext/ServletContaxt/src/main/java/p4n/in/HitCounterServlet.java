package p4n.in;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import java.io.*;
public class HitCounterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Get the ServletContext
        ServletContext context = getServletContext();
        //Get the current hit count
        Integer hitCount = (Integer) context.getAttribute("hitCount");
        if (hitCount == null) {
            hitCount = 1;
        } else {
            hitCount++;
        }
     // Set the updated hit count back into the ServletContext
        context.setAttribute("hitCount", hitCount);
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Hit Counter</h1>");
        out.println("<p>Total Hits: " + hitCount + "</p>");
        out.close();
	}

}
