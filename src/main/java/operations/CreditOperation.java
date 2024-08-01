package operations;

import interfaces.ICreditOperation;

public class CreditOperation implements ICreditOperation{

	@Override
	public double CalculateInterestToPay(double credit, double interestPrcnt, int duration) {
		
		double t = (interestPrcnt/100)/12;
		double t1 = credit * t;
		double t2 =1-Math.pow(1+t, -duration);
		
		return t1/t2;
	}

}
