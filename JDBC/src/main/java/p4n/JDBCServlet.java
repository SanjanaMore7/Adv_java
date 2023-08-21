package p4n;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.*;
import java.sql.*;


public class JDBCServlet extends HttpServlet {
	    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/cwp";
	    private static final String JDBC_USERNAME = "root";
	    private static final String JDBC_PASSWORD = "admin";
	
	    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	    {
		
	    	 response.setContentType("text/html");
	         PrintWriter out = response.getWriter();
	         try{  
	        	 Class.forName("com.mysql.jdbc.Driver");  
	        	 Connection con=DriverManager.getConnection(  
	        			 JDBC_URL,JDBC_USERNAME,JDBC_PASSWORD);  
	        	  
	        	 Statement stmt=con.createStatement();  
	        	 ResultSet rs=stmt.executeQuery("select * from emp");  
	        	 while(rs.next())  
	        	 out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3));  
	        	 con.close();  
	        	 }catch(Exception e){ 
	        		 System.out.println(e);
	        		 }  
	        	}  

	    }



