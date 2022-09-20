package com.bridgelabz.oops;

public class Stock {
	  String shareName;
	    int numberOfShares;
	    float sharePrice;
	    float stockValue;

	    @Override
	    public String toString() {
	        return "\n"+"Stock{" +
	                "shareName='" + shareName + '\'' +
	                ", numberOfShares=" + numberOfShares +
	                ", sharePrice=" + sharePrice +
	                ", stockValue=" + stockValue +
	                '}';
	    }
}
