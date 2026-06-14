package main;

import java.util.ArrayList;

public class Transaction {
	private double unitPrice;
	private double totalPrice;
	private double tax;

	public Transaction(double unitPrice, double count) {
		this.unitPrice = unitPrice;
		this.totalPrice = unitPrice * count;
		this.tax = (unitPrice / 10) * count;
	}

	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	
}
