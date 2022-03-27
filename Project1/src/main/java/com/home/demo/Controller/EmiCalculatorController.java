package com.home.demo.Controller;


import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.home.demo.Entity.EligibilityCalculator;
import com.home.demo.Entity.EmiCalculator;
import com.home.demo.Service.IEligibilityCalculatorService;
import com.home.demo.Service.IEmiCalculatorService;



	@RestController
	@RequestMapping(value="/")
	public class EmiCalculatorController {

		@Autowired
		private IEmiCalculatorService emiCalculatorService;
		@Autowired
		private IEligibilityCalculatorService eligibilityCalculatorService;
		
		@PostMapping("/emi/calculate")
		public Double calculatemi(@RequestBody  EmiCalculator emicalculator) {
			double emi=emiCalculatorService.calculatemi(emicalculator);
			return emi;
			
		}
		
		@PostMapping("/eligibility/check")
		public Double maxLoan(@RequestBody EligibilityCalculator calc) {
			double checkEligibility = eligibilityCalculatorService.maxLoan(calc);
			return checkEligibility;
			
				
			}
		}
	


		


