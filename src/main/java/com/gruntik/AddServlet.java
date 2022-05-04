package com.gruntik;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/add")
public class AddServlet extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {

		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));

		int sum = i + j;
		System.out.println("sum: " + sum);

		PrintWriter pw = res.getWriter();
		pw.println("sumPOst: " + sum);

	}

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));

		int sum = i + j;
		System.out.println("sum: " + sum);

		req.setAttribute("sum1", sum);

		HttpSession session = req.getSession();
		session.setAttribute("sum1", sum);

		Cookie cookie = new Cookie("sum2", "" + sum);
		res.addCookie(cookie);

		res.sendRedirect("sq?sum=" + sum);

//		RequestDispatcher rd = req.getRequestDispatcher("sq");
//		rd.forward(req, res);

	}
}
