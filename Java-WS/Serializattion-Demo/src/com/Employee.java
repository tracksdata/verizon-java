package com;

import java.io.Serializable;

public class Employee implements Serializable {

	private static final long serialVersionUID = 76L;

	private int id;
	private String name;
	transient double  salary;
	

	void f1() {
	}

	void f2() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
