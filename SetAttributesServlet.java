package com.sistec.scope;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns= {"/set-attribute"})
public class SetAttributesServlet extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//set attribute in request scope
	req.setAttribute("a", "SISTEC");
	//set attribute in session scope
	HttpSession session=req.getSession();
	session.setAttribute("b", "sps");
	//set Attribute in application scope
	ServletContext application=getServletContext();
	application.setAttribute("c", "Trainer");
	RequestDispatcher dispatcher=req.getRequestDispatcher("get-attribute");
	dispatcher.forward(req, resp);
}
}
