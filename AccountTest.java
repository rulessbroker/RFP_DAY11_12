package com.bridgelabz.oops;



public class AccountTest {
	 public static void main(String[] args) {
	        StockAccount account= new StockAccount();
	        account.accountBalance = 50000;
	        account.sell();
	        account.buy();
	        account.printReport();
	        account.debit(55000);
	    }
}
