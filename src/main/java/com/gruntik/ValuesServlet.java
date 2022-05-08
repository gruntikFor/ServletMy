package com.gruntik;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/values")
public class ValuesServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		List<Student> list = Arrays.asList(new Student(23, "misha"), new Student(144, "pasha"), new Student(43, "Igorok"));

		req.setAttribute("listStudent", list);
		req.setAttribute("name", "igor");
		req.getRequestDispatcher("values.jsp").forward(req, res);

	}
}
