package com.demo.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.dao.BookDAO;
import com.demo.dao.FlowerDAO;
import com.demo.dao.ToyDAO;
import com.demo.model.Product;
import com.demo.util.DatabaseConfig;

@WebServlet(urlPatterns = "/product-catalog", loadOnStartup = 1)
public class ProductCatalogController extends HttpServlet {
	private BookDAO bookDAO;
	private FlowerDAO flowerDAO;
	private ToyDAO toyDAO;
	private DatabaseConfig databaseConfig;

	@Override
	public void init() throws ServletException {
		this.databaseConfig = new DatabaseConfig();
		this.bookDAO = new BookDAO(databaseConfig.getUrl(), 
								   databaseConfig.getUsername(), 
								   databaseConfig.getPassword());
		this.flowerDAO = new FlowerDAO(databaseConfig.getUrl(), 
				 databaseConfig.getUsername(), 
				 databaseConfig.getPassword());
		this.toyDAO = new ToyDAO(databaseConfig.getUrl(), 
				 databaseConfig.getUsername(), 
				 databaseConfig.getPassword());
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		final String linkName = request.getParameter("linkName");
		System.out.println(linkName);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/productList.jsp");
		List<Product> product = null;
		if (linkName.equals("book")) {
			product = bookDAO.listAllBooks();
		} else if (linkName.equals("flower")) {
			product = flowerDAO.listAllFlowers();
		} else if (linkName.equals("toy")) {
			product = toyDAO.listAllToys();
		}
		request.setAttribute("productCatalog", product);
		request.setAttribute("linkName", linkName);
		dispatcher.forward(request, response);
	}
}
