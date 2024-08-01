package model;

public class CreditModel {
	
	private double credit;
	private double interestPrcnt;
	private int duration;
	private double interestToPay;
	
	public CreditModel() {
		super();
	}
	public CreditModel(double credit,double interestPrcnt,int duration) {
		super();
		this.credit=credit;
		this.interestPrcnt=interestPrcnt;
		this.duration=duration;
	}
	public double getCredit() {
		return credit;
	}
	public void setCredit(double credit) {
		this.credit = credit;
	}
	public double getInterestPrcnt() {
		return interestPrcnt;
	}
	public void setInterestPrcnt(double interestPrcnt) {
		this.interestPrcnt = interestPrcnt;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public double getInterestToPay() {
		return interestToPay;
	}
	public void setInterestToPay(double interest) {
		this.interestToPay = interest;
	}
	
}
