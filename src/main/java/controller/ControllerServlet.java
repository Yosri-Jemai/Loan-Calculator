package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import operations.CreditOperation;

public class ControllerServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	private String pathViews;

	@Override
	public void init() throws ServletException {
		pathViews = getInitParameter("pathViews");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher(pathViews+"/CalculatorView.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		double credit = Double.parseDouble(req.getParameter("capital"));
		double interest = Double.parseDouble(req.getParameter("interest"));
		double duration = Double.parseDouble(req.getParameter("duration"));
		//System.out.println(credit+" "+interest+" "+duration);
	}
	
}
