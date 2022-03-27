package com.home.demo.Entity;

public class EligibilityCalculator {
	
	private Double monthlyIncome;
	private Double rOI;
/*		private Boolean eligiblity;
	private Double maxLoan;*/
	
	
	public Double getmonthlyIncome() {
		return monthlyIncome;
	}
	public EligibilityCalculator() {
	super();
}
	public void setmonthlyIncome(Double monthlyIncome) {
		this.monthlyIncome = monthlyIncome;
	}
	public Double getrOI() {
		return rOI;
	}
	public void setrOI(Double rOI) {
		this.rOI = rOI;
	}/*
	public Boolean getEligiblity() {
		return eligiblity;
	}
	public void setEligiblity(Boolean eligiblity) {
		this.eligiblity = eligiblity;
	}
	public Double getMaxLoan() {
		return maxLoan;
	}
	public void setMaxLoan(Double maxLoan) {
		this.maxLoan = maxLoan;
	}*/

	@Override
	public String toString() {
		return "EligibiltyCalculator [monthlyIncome=" + monthlyIncome + ", rOI=" + rOI + "]";
	}
	
	


}
