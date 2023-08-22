package p4n;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.*;

public class LoginServlets extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String username=request.getParameter("username");
			String password=request.getParameter("password");
			
			// Perform authentication here (for simplicity, let's assume a valid username/password)
		if("valid_username".equals("username")&&"valid_password".equals("password")) {
			HttpSession session=request.getSession();
			session.setAttribute("username", username);// Set username in the session
			response.sendRedirect("ProfileServlet.java");// Redirect to profile page
			
		}else {
			response.sendRedirect("login.html");// Redirect back to login page on failed login
		}
		
		}

	}

