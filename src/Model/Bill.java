package Model;

import java.util.Date;

public class Bill {
	private Cart cart;
	private double totalCost;
	private String customerName, address;
	private Date date;
	
	public Bill(Cart cart, double totalCost, String customerName, String address, Date date) {
		this.cart = cart;
		this.totalCost = totalCost;
		this.customerName = customerName;
		this.address = address;
		this.date = date;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
