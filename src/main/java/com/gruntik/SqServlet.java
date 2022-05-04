package com.gruntik;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

		int sum = (int) req.getAttribute("sum");
		int sq = sum * sum;

		PrintWriter pw = res.getWriter();
		pw.println("SqServlet");
		pw.println("sq = " + sq);
	}
}
