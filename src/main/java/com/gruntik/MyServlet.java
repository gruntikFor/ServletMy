package com.gruntik;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/my")
public class MyServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

		PrintWriter pr = res.getWriter();

		ServletContext ctx = getServletContext();
		String name = ctx.getInitParameter("name");

		ServletConfig cfg = getServletConfig();
		String nameCfg = cfg.getInitParameter("name");

		pr.println("hello");
		pr.println(name);
		pr.println(nameCfg);
	}

}
