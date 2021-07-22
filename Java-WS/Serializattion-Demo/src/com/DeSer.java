package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSer {
	public static void main(String[] args) {

		Employee emp = null;

		try {
			File fileLoc = new File("src/test.txt");
			if (!fileLoc.exists()) {
				return;
			}

			FileInputStream fis = new FileInputStream(fileLoc);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object fileObj = ois.readObject();

			if (fileObj instanceof Employee) {
				emp = (Employee) fileObj;
				System.out.println(emp.getId());
				System.out.println(emp.getName());
				System.out.println(emp.salary);
			}

		} catch (Exception e) {
			System.out.println("Failed due to " + e);
		}

	}

}
