package operations;

import interfaces.ICreditOperation;

public class CreditOperation implements ICreditOperation{

	@Override
	public double LoanInterest(double capital, double interest, double duration) {
		
		double t = (interest/100)/12;
		double t1 = capital * t;
		double t2 =1-Math.pow(1+t, -duration);
		
		return t1/t2;
	}

}
