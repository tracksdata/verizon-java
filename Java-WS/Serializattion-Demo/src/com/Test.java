package com;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.setId(10);
		emp.setName("Praveen");
		emp.salary=1000;

		try {

			FileOutputStream fos = new FileOutputStream("src/test.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(emp);
			System.out.println(">>> Writing is done ..");

		} catch (Exception e) {
			System.out.println("Failed due to " + e);
		}

	}

}
