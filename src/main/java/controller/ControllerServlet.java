package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.CreditModel;
import operations.CreditOperation;

public class ControllerServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	private String pathViews;
	private CreditOperation co;

	@Override
	public void init() throws ServletException {
		pathViews = getInitParameter("pathViews");
		co = new CreditOperation();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("creditModel", new CreditModel());
		req.getRequestDispatcher(pathViews+"/CalculatorView.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		double credit = Double.parseDouble(req.getParameter("credit"));
		double interestPrcnt = Double.parseDouble(req.getParameter("interest"));
		int duration = Integer.parseInt(req.getParameter("duration"));
		CreditModel model = new CreditModel(credit,interestPrcnt,duration);
		model.setInterestToPay(co.CalculateInterestToPay(model.getCredit(), model.getInterestPrcnt(), model.getDuration()));
		req.setAttribute("creditModel", model);
		req.getRequestDispatcher(pathViews+"/CalculatorView.jsp").forward(req, resp);
	}
	
}
