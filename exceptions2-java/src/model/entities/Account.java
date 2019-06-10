package model.entities;

import model.exception.DomainExceptions;

public class Account {
	private double whithdrawLimit;
	private String holder;
	private int number;
	private double balance;
	
	public Account() {
		
	}
	public Account (String holder, double whithdrawLimit, int number, double balance) {
		this.balance = balance;
		this.holder = holder;
		this.number = number;
		this.whithdrawLimit = whithdrawLimit;
	}
	public double getWhithdrawLimit() {
		return whithdrawLimit;
	}
	public void setWhithdrawLimit(double whithdrawLimit) {
		this.whithdrawLimit = whithdrawLimit;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public double getBalance() {
		return balance;
	}
	public void deposit(double deposit) {
		balance += deposit;
	}
	public void whithdraw (double whithdraw) throws DomainExceptions {
		if (whithdraw > balance) {
			throw new DomainExceptions("You dont have balance for this whith draw.");
		}
		if (whithdraw > whithdrawLimit) {
			throw new DomainExceptions("Exceds whithdraw limit");
		}
		balance -= whithdraw;
	}
	

}
