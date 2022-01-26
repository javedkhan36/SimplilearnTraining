package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/getpostDemo")
public class HttpServExa extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter  out = resp.getWriter();
		out.append("<html><body>");
		out.print("welcome to GET Example! ");
		
		String name = req.getParameter("name");
		
		out.append("hello "+name);
	
		out.append("</html></body>");
	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out = resp.getWriter();
		out.append("<html><body>");
		out.append("Welcome to POST Example! ");
		String name = req.getParameter("name");
		
		out.append("hello "+name);
		
		out.append("</body></html>");
	}

}
