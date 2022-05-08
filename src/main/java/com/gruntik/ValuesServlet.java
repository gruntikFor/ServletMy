package com.gruntik;

import java.awt.PrintGraphics;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/values")
public class ValuesServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		req.setAttribute("name", "igor");
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("values.jsp");
		requestDispatcher.include(req, res);
	

	}
}
