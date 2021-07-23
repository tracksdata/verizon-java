package com.cts.eshop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.eshop.config.AppConfig;
import com.cts.eshop.dao.PriceMatrixImpl;
import com.cts.eshop.service.BillingImpl;

public class Test {

	public static void main(String[] args) {

		String[] cart1 = { "Item1", "Item2", "Item3" };
		String[] cart2 = { "Item3", "Item4" };
		
		ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		
		
		
		//-------------------------------------------
		//PriceMatrixImpl price=new PriceMatrixImpl(); // dependency
		//-------------------------------------------

		// Get Total Bill of a Cart
		
		BillingImpl biller = ac.getBean(BillingImpl.class);
		
		//BillingImpl biller = new BillingImpl(); // dependent 
		
		//biller.setPrice(price);  // Injecting / passing dependency object (price) to the dependent object (biller) is called DI
		//---------------------------------------------
		
		double total = biller.getCartTotal(cart1);
		System.out.println("Cart1 Total : " + total);

		total = biller.getCartTotal(cart2);
		System.out.println("Cart2 Total : " + total);

	}

}
