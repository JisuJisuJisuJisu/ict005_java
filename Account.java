package com.lgcns.test04;

public class Account {
	public String account;
	public int balance;
	public double interestRate;
	
	public Account()
	{	
	}

 public Account ( String account, int balance, double interestRate)
 {
	 this.account=account;
	 this.balance=balance;
	 this.interestRate=interestRate;
 }
 
 public void setAccount(String account)
 {
	 this.account=account;
 }
 public String getAccount()
 {
	 return account;
 }
 
 public void setBalance(int balance)
 {
	 this.balance=balance;
 }
 public int getBalance()
 {
	 return balance;
 }
 
 public void setInterestRate (double interestRate)
 {
	 this.interestRate = interestRate;
 }
 
 public double getInterestRate()
 {
	 return interestRate;
 }
 
 public double calculateInterest()
 {
	 return balance*interestRate;
 }
 public void deposit(int money)
 {
	 balance= money+ balance;
 }
 
 public void withdraw(int money)
 {
	 balance=balance-money;
 }
 
}


