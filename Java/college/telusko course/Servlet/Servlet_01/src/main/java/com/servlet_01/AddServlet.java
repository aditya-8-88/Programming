package com.servlet_01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String num1Str = req.getParameter("num1");
		String num2Str = req.getParameter("num2");

		try {
			int num1 = Integer.parseInt(num1Str);
			int num2 = Integer.parseInt(num2Str);
			int sum = num1 + num2;

			Cookie cookie = new Cookie("k", Integer.toString(sum));
			res.addCookie(cookie);
			res.sendRedirect("WEB-INF/new.jsp");

		} catch (NumberFormatException e) {
			res.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			PrintWriter out = res.getWriter();
			out.println("Error: Invalid input. Please provide valid numbers.");
		}
	}
}
