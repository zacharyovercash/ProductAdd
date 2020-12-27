package com.servlet;

import com.product.Product;
import com.service.ProductService;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductService productService = new ProductService();
		System.out.println("inside Servlet");
		Product product = new Product(request.getParameter("id"),request.getParameter("name"),request.getParameter("type"));
		
		productService.Product(product);
		HttpSession session = request.getSession();
		session.setAttribute("sesname", request.getParameter("name"));
		response.sendRedirect("RegisterSuccess.jsp");
		
	}

}
