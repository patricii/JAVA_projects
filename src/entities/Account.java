package entities;

public class Account {
	
	private String name;
	private int numCode;
	private double amount;
	
	public Account (String name, int numCode, double plusamount) {
		this.name = name;
		this.numCode = numCode;
		deposit(plusamount);
	}
	public Account (String name, int numCode) {
		this.name = name;
		this.numCode = numCode;

	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumCode() {
		return numCode;
	}
	public double getAmount() {
		return amount;
	}
	
	public void deposit(double amount) {
		this.amount += amount;
	}
	public void withdraw(double amount) {
		this.amount -= (amount + 5.00);
	}
	public String ToString() {
		
		return "Client name: " + 
		name + 
		", Account number code: " + 
		numCode + 
		", " + 
		"Saldo em conta: R$ " + String.format("%.2f", amount);
	}
	

}
