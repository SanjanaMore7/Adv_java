package com.example.myapp1;

import java.io.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    //private String message;

    public void init() {
     //  message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        String name,email;
        name = request.getParameter("name");
        email = request.getParameter("email");
        out.println("<h1>" +name+ "</h1>");
        out.println("<h1>" +email+ "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}