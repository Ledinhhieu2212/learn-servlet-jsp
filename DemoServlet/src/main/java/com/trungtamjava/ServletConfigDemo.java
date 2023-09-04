package com.trungtamjava;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// Cách map trong file java không cần phải cấu hình trong web.xml
//@WebServlet(urlPatterns = {"/test-config"}, initParams = {
//		@WebInitParam(name="name",value = "trung tam java")
//})


public class ServletConfigDemo extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = super.getServletConfig().getInitParameter("name");
		resp.setContentType("text/html");

		PrintWriter printWriter = resp.getWriter();
		printWriter.println("Xin chào " + name);
		printWriter.close();
	}
}
