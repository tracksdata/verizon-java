package com;

public class Test {

	public static void main(String[] args) {

		/*
		 * Bank b=new Bank();
		 * 
		 * b.withDraw(); // banker 
		 * b.withDraw(); // customer 
		 * b.openAccount();
		 * b.closeAccount();
		 */
		
		Manager m=new Bank();
		m.lockerAcesss();

		Banker b = new Bank();
		
		b.closeAccount();
		b.openAccount();
	
		
		Customer c = new Bank();
		c.deposit();
		c.withDraw();
		
		
		
		
		

	}

}
