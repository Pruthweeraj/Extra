package com.pp;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class BankTransation {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		BankAccount account1 = new BankAccount(24575454,"Pruthweeraj Panda" , "PR" , "prpr",999999);
		
		BankAccount account2 = new BankAccount(25444,"Harini" , "HR" , "hrhr",000001);
		
		
		//printing Account Object
		System.out.println(account1);
		System.out.println(account2);
		
		//creating OOS object
		ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream("C:\\Users\\PR\\Desktop\\DEMO2\\acc1.ser"));
		ObjectOutputStream stream2 = new ObjectOutputStream(new FileOutputStream("C:\\Users\\PR\\Desktop\\DEMO2\\acc2.ser"));
		
		
		//writing bank object state to file
		stream.writeObject(account1);
		stream2.writeObject(account2);
		
		System.out.println("Object written to file");
		
	}
	
	
}
