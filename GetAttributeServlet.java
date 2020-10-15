package com.sistec.scope;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns= {"/get-attribute"})
public class GetAttributeServlet extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	//get attribute from request scope
	String a= (String)req.getAttribute("a");
	//get attribute from session scope
	String b= (String)req.getSession().getAttribute("b");
	//get attribute from application scope
	String c=(String)getServletContext().getAttribute("c");
	PrintWriter out=resp.getWriter();
	resp.setContentType("text/html");
	out.print("Request Scope");
}
}
