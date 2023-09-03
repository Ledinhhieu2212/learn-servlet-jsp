package com.trungtamjava;

import java.awt.print.Printable;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

	@Override
	public void init() throws ServletException {
		System.out.println("Bat dau servlet");
	}
	
	@Override
	public void destroy() {
		System.out.println("Ket thuc cua servlet");
	}
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(arg0, arg1);
		
		System.out.println("phuong thuc cua request " + arg0.getMethod());
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");;
		
		PrintWriter writer = resp.getWriter();
		writer.println("<h1>Xin chao servelet</h1>");
		writer.close();
	}
}
