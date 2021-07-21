package com;

public class HR {

	public static void main(String[] args) {
		
		
		//SalariedEmployee se=new SalariedEmployee();
		//se.calculateSalary(); // ?
		
		//ContractEmployee ce=new ContractEmployee();
		//ce.calculateSalary(); //? 
		
		/*
		 * Notes
		 * -------
		 * 1. Never create object of sub class directly
		 * 2. Instead save sub class object in the super class reference
		 * 3. Super class can store/hold all its sub class objects
		 * 4. Super class reference can be used to access,
		 * 		-> all methods in super class and
		 * 		-> over-ridden methods of sub class only
		 * 5. Super class reference can not be used to access,
		 * 		-> Individual methods(a method which defined in sub class and not defined in super class) of sub class
		 * 
		 */
		
		Employee emp=new SalariedEmployee();
		emp.calculateSalary(); //? 
		emp.display();
		
		
		

	}

}
