package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import model.entities.Account;
import model.exception.DomainExceptions;

public class Program {

	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Name: ");
		String name = sc.next();
		System.out.print("Number account: ");
		int number = sc.nextInt();
		System.out.print("Initial Balance: ");
		double balance = sc.nextDouble();
		System.out.print("WhithDraw limite: ");
		double whithdrawlimit = sc.nextDouble();
		
		Account account = new Account(name,whithdrawlimit,number,balance);
		
		System.out.print("Enter amount for whithdraw: ");
		account.whithdraw(sc.nextDouble());
		
		System.out.printf("New Balance R$ %.2f", account.getBalance());
		
		
		sc.close();
		}
		catch (DomainExceptions e) {
			System.out.print(e.getMessage());
		}
		catch (InputMismatchException e) {
			System.out.print("Input error");
		}
	}

}
