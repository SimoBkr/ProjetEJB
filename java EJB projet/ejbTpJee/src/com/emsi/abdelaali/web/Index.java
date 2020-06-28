package com.emsi.abdelaali.web;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.emsi.abdelaali.ejb.entities.Article;
import com.emsi.abdelaali.ejb.sessions.IArticleEjbLocal;

@WebServlet(name="cs", urlPatterns = {"/Article"})
public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@EJB
	private IArticleEjbLocal metier;
	
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cat = request.getParameter("cat");
		String sub = request.getParameter("sub");
		double price = Double.parseDouble(request.getParameter("price"));
		int qty = Integer.parseInt(request.getParameter("qty"));
		String desc = request.getParameter("desc");
		Article article = new Article();
		article.setCategory(cat);
		article.setDescription(desc);
		article.setPrice(price);
		article.setQuantity(qty);
		article.setSubcategory(sub);
		metier.addArticle(article);
		List<Article> arts = metier.articleList();
		request.setAttribute("articles", arts);
		doGet(request, response);
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Article> arts = metier.articleList();
		request.setAttribute("articles", arts);
		request.getRequestDispatcher("ArticleView.jsp").forward(request, response);
	}

}
