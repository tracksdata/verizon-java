package com;

public class ContractEmployee extends Employee {

	public void calculateSalary() {
		this.setSalary(100 * 3000);
		System.out.println(">>> ContractEmployee::calculateSalary");

	}
}
