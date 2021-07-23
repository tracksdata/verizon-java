package com.cts.eshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.eshop.dao.PriceMatrixImpl;

//Dependent
@Service
public class BillingImpl {
	
	/*
	 * Types of Objects
	 * -------------------
	 * 1. Dependency: Works independently. Never depends on other objects
	 * 2. Dependent : Always depends on dependency object. 
	 * 
	 * Design issues 
	 * --------------
	 * -> Too many dependency object creations
	 * 			-> Performance of application goes down
	 * 			-> memory management is very difficult
	 * 
	 * Why this issue happened?
	 * --------------------------
	 * -> Dependent class itself creating dependency class object directly
	 * 
	 * What is the solution?
	 * ----------------------
	 * -> Do not create dependency object in the dependent class directly
	 * -> Instead use look-up techniques like JNDI .. etc.
	 * -> JNDI location is tightly coupled with dependent class
	 * 
	 * What is the best solution?
	 * ----------------------------
	 * -> Do not create, or find, instead ask some one (container) IoC (Inversion of Control)
	 * 
	 * How to Design IoC?
	 * -------------------
	 * -> using Dependency injection technique. (DI)
	 * 
	 * What is DI?
	 * -------------
	 * -> Injecting / passing dependency object to the dependent object
	 * 
	 * How many ways DI can be implemented? : 2 types
	 * 1. Setter based DI
	 * 2. Constructor based DI
	 * 
	 * Setter based DI
	 * ------------------
	 * Rules
	 * 1. Define dependency class reference in the dependent class at class level
	 * 2. Create setter method for the above defined dependency reference 
	 */

	@Autowired
	private PriceMatrixImpl price; // Dependency reference
	  
	//public void setPrice(PriceMatrixImpl price) {
	//	this.price = price;
	//}


	public double getCartTotal(String[] cart) {

		//PriceMatrixImpl price = new PriceMatrixImpl(); //dependency

		double total = 0.0;
		for (String itemCode : cart) {
			total = total + price.getItemprice(itemCode);
		}

		return total;
	}

}
