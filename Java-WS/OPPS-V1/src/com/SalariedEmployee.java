package com;

public class SalariedEmployee extends Employee {

	// is is mandate to over ride calculateSalary method here? :: YES
	
	public void calculateSalary() {
		this.setSalary(22*3000);
		System.out.println(">>> SalariedEmployee::calculateSalary");
	}
	
	
	public void f1() {
		// sensitive 
	}
}
