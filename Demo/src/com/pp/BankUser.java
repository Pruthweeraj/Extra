package com.pp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class BankUser {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		// creating OIS object
		ObjectInputStream stream = new ObjectInputStream(new FileInputStream("C:\\Users\\PR\\Desktop\\DEMO2\\acc1.ser"));
		ObjectInputStream stream2 = new ObjectInputStream(new FileInputStream("C:\\Users\\PR\\Desktop\\DEMO2\\acc2.ser"));

		//Casting return Object to Bank type
		BankAccount account1 = (BankAccount)stream.readObject();
		BankAccount account2 = (BankAccount)stream2.readObject();
		
		//printing Bank Object Data
		System.out.println(account1.getAccHName()+"Details");
		System.out.println(account1);
		
		System.out.println(account2.getAccHName()+"Details");
		System.out.println(account2);
		
	}
}
