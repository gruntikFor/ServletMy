package com.gruntik;

import java.awt.PrintGraphics;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sq")
public class SqServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		
		int k = 9/0;

//		int sum = (int) req.getAttribute("sum");
//		int sq = sum * sum;
//
		int sumCookie = 0;

		Cookie[] cookies = req.getCookies();

		System.out.println("cookies");
		System.out.println(Arrays.toString(cookies));

		for (Cookie c : cookies) {
			System.out.println("name: " + c.getName() + " val:" + c.getValue());
		}

		HttpSession session = req.getSession();
//		session.removeAttribute("sum1");

		int sum1 = (int) session.getAttribute("sum1");

		int sum2 = Integer.parseInt(req.getParameter("sum"));
		sum2 = sum2 * sum2;
		PrintWriter pw = res.getWriter();
//		pw.println();
		pw.println("<h1>SqServlet</h1>");
		pw.println("sum1 = " + sum1);
		pw.println("sq = " + sum2);
		
		pw.println("<br>n = " + k);

	}
}
