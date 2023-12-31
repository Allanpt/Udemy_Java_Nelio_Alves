package entities;

import util.tax;

public class BankAccout {
	
	private int accoutNumber;
	public String name;
	private double initialDeposit;
	
	public BankAccout(int accoutNumber, String name, double initialDeposit) {
		super();
		this.accoutNumber = accoutNumber;
		this.name = name;
		deposit(initialDeposit);
	}

	public BankAccout(int accoutNumber, String name) {
		super();
		this.accoutNumber = accoutNumber;
		this.name = name;
	}
	
	public int getAccoutNumber() {
		return accoutNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getInitialDeposit() {
		return initialDeposit;
	}
	
	public void deposit(double deposit) {
		this.initialDeposit += deposit;
	}
	
	public void withdraw(double withdraw) {
		this.initialDeposit -= withdraw - tax.TAX;
	}
	
	public String toString() {
		return "Account " + accoutNumber + ", Holder: " + name + ", Balance: $" + String.format("%.2f", initialDeposit);
	}
	
	public String Update() {
		return "Update accout Data:";
	}
}
