package com.home.demo.Entity;

public class EmiCalculator {

	
	private Double loan;
	private Double tenure;
	public Double RateOfInterest;


	public EmiCalculator() {
		// TODO Auto-generated constructor stub
	}


	public Double getLoan() {
		return loan;
	}


	public void setLoan(Double loan) {
		this.loan = loan;
	}


	public Double getTenure() {
		return tenure;
	}


	public void setTenure(Double tenure) {
		this.tenure = tenure;
	}


	public Double getGetRateOfInterest() {
		return RateOfInterest;
	}


	public void setGetRateOfInterest(Double getRateOfInterest) {
		this.RateOfInterest = getRateOfInterest;
	}


	@Override
	public String toString() {
		return "EmiCalculator [loan=" + loan + ", tenure=" + tenure + ", getRateOfInterest=" +RateOfInterest + "]";
	}
	


}