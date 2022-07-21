package com.lgcns.test04;

public class AccountTest {

	public static void main(String[] args) {

		Account account = new Account("411-0290-1203",500000,7.3/100);
		
		System.out.println("계좌정보: "+account.getAccount()+"현재잔액: "+account.getBalance());
		
			account.deposit(20000);
			account.calculateInterest();
			
			System.out.println("게좌정보: "+account.getAccount()+"현재잔액: "+account.getBalance());
				System.out.println("이자: "+account.calculateInterest());
	}

}
