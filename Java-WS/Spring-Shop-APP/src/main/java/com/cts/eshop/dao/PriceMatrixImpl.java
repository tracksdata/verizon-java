package com.cts.eshop.dao;

import org.springframework.stereotype.Repository;

//dependency
@Repository
public class PriceMatrixImpl {

	public PriceMatrixImpl() {
		System.out.println(">>> PriceMatrixImpl object created..");
	}

	public double getItemprice(String itemCode) {
		// code to fetch price of given item code from db
		return 100.00;
	}

}
