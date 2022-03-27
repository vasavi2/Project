package com.home.demo.Service;

import org.springframework.stereotype.Service;

import com.home.demo.Entity.EligibilityCalculator;


@Service
public class EligibilityCalculatorService  implements IEligibilityCalculatorService{

	

		@Override
		public double maxLoan(EligibilityCalculator calc) {
			
			return 60*(0.6*calc.getmonthlyIncome());
		}

	}

