package edu.unsw.comp9321;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletTwo
 */
public class ServletTwo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletTwo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html"); 
		PrintWriter out = response.getWriter(); 
		out.println("<HTML><HEAD>"); 
		out.println("<TITLE>ServletTwo</TITLE>");
		out.println("</HEAD><BODY>");
		out.println("<H1>I come from doGet() in ServletTwo</H1>");
		out.println("<h2>My name is "+request.getParameter("name")+"</h2>");
		out.println("<h1>My country is "+request.getAttribute("country")+"</h1>");
		//out.println("<B>Request Parameters in SecondServlet</B><BR>");
		out.println("</BODY></HTML>");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html"); 
		PrintWriter out = response.getWriter(); 
		out.println("<HTML><HEAD>"); 
		out.println("<TITLE>ServletTwo</TITLE>");
		out.println("</HEAD><BODY>");
		out.println("<H1>I come from doPost() in ServletTwo</H1>");
		out.println("</BODY></HTML>");
		out.close();
	}

}
