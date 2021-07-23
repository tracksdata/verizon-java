package com.cts.eshop;

import com.cts.eshop.dao.PriceMatrixImpl;
import com.cts.eshop.service.BillingImpl;

public class Test {

	public static void main(String[] args) {

		String[] cart1 = { "Item1", "Item2", "Item3" };
		String[] cart2 = { "Item3", "Item4" };
		
		
		//-------------------------------------------
		PriceMatrixImpl price=new PriceMatrixImpl(); // dependency
		//-------------------------------------------

		// Get Total Bill of a Cart
		BillingImpl biller = new BillingImpl(); // dependent 
		
		biller.setPrice(price);  // Injecting / passing dependency object (price) to the dependent object (biller) is called DI
		//---------------------------------------------
		
		double total = biller.getCartTotal(cart1);
		System.out.println("Cart1 Total : " + total);

		total = biller.getCartTotal(cart2);
		System.out.println("Cart2 Total : " + total);

	}

}
