package be.info;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet("/FirstServlet")
@SuppressWarnings("unused")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.write("<html><head><title>Bienvenue</title></head>"
                + "<body><h1>Bienvenue</h1>"
                + "<p>Bonjour ");
        if (name != null && name.length() > 0)
            out.write(name);
        else
            out.write("cher inconnu");
        out.write("</p></body></html>");
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
