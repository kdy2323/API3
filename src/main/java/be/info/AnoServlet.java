package be.info;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.*;

@WebServlet("/AnoServlet")
public class AnoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private String username;
    private String password;
    
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        
        username = config.getInitParameter("username");
        password = config.getInitParameter("password");
    }
    
    public AnoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		if((username != null && username.length() >0)&&(password != null && password.length() >0)) {
		      out.write("<p> Welcome, "+username + "!</p>");
			  out.write("<p> Connexion reussie </p>");
		} else {
		    out.write(" <p> Echec de connexion </p>");
		}
	    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
