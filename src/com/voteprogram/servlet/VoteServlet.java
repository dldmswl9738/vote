package com.voteprogram.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/VoteServlet")
public class VoteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public static int yesCount=0;
    public static int noCount=0;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String uri = request.getRequestURI();
		uri= uri.substring(uri.indexOf("/",1)+1);
		System.out.println(uri);
		
		if("yes".equals(uri)){
			yesCount+=1;
		}else if("no".equals(uri)){
			noCount+=1;
		}
		
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/views/index.jsp");
		requestDispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		
		

		
	}

}
