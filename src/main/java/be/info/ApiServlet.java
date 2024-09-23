package be.info;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.*;

import org.apache.jasper.tagplugins.jstl.core.Out;

//@WebServlet("/ApiServlet")
@SuppressWarnings("unused")
public class ApiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public ApiServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    private String apikey;
    public void init() throws ServletException {
    	super.init();
    	apikey = getInitParameter("api-key");
    	if(apikey == null) {
    		throw new ServletException("API Key missing");
    	}
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		out.write("<p>L'API Key est "+apikey+"</p>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
