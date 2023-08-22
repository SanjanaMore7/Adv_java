package p4n;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.*;

public class ProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();   //Get the current session or create a new one
		// Check if the user is logged in (you might use a more sophisticated login mechanism)
		String username=(String)session.getAttribute("username");
		if(username==null) {
			response.sendRedirect("login.html");// Redirect to login page if not logged in
			return;
		}
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html><body>");
		out.println("<h1>Welcome, " + username + "!</h1>");
		 // Display user-specific profile information here
		out.println("</body></html>");
	}

}
