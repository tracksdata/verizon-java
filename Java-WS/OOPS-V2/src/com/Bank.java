package com;

public class Bank implements Banker, Customer, Manager {

	@Override
	public void lockerAcesss() {
		System.out.println(">>> Locker access granted...");
	}

	@Override
	public void openAccount() {
		System.out.println(">>> Account is opened");
	}

	@Override
	public void closeAccount() {
		System.out.println(">>> Account is closed....");
	}

	@Override
	public void withDraw() {
		System.out.println(">>> withdrawing....");
	}

	@Override
	public void deposit() {
		System.out.println(">>> depositing....");
	}

}
