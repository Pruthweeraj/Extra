package com.pp;

import java.io.Serializable;

public class BankAccount implements Serializable {

	private long accNo;
	private String accHName;
	private String usrrName;
	private String password;
	private double balance;

	
	
	public BankAccount() {
		
	}

	public BankAccount(long accNo, String accHName, String usrrName, String password, double balance) {
		super();
		this.accNo = accNo;
		this.accHName = accHName;
		this.usrrName = usrrName;
		this.password = password;
		this.balance = balance;
	}

	public long getAccNo() {
		return accNo;
	}

	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}

	public String getAccHName() {
		return accHName;
	}

	public void setAccHName(String accHName) {
		this.accHName = accHName;
	}

	public String getUsrrName() {
		return usrrName;
	}

	public void setUsrrName(String usrrName) {
		this.usrrName = usrrName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = this.balance + balance;
	}

	@Override
	public String toString() {
		return "BankAccount [accNo=" + accNo + ", accHName=" + accHName + ", usrrName=" + usrrName + ", password="
				+ password + ", balance=" + balance + "]";
	}

}
