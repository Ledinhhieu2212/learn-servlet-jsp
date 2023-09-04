package com.trungtamjava;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/ditmemay","/123concac" })
public class HelloServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");

		PrintWriter printWriter = resp.getWriter();
		printWriter.println("Xin chào chung tâm Java");
		printWriter.println("<p>Servlet ra là hay</p>");
		printWriter.close();
	}
}
