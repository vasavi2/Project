package com.home.demo.Service;

import org.springframework.stereotype.Service;

import com.home.demo.Entity.EmiCalculator;
@Service
public class EmiCalculatorService implements IEmiCalculatorService{
	@Override
	public Double calculatemi(EmiCalculator emicalculator) {
			Double loan = emicalculator.getLoan();
			Double tenure = emicalculator.getTenure();
			Double rate = emicalculator.getGetRateOfInterest();
			Double emi =loan*rate*(Math.pow(1+rate,tenure))/Math.pow(1+rate,tenure-1);
		return emi;
	}
	

	
}
