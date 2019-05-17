package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enuns.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Date date = new Date();
		
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date:");
		String birthDate = sc.nextLine();
		
		Client client = new Client(name,email,sdf.parse(birthDate));
		
		System.out.print("Order Status:  ");
		String status = sc.nextLine();
		System.out.print("How many itens to this order? ");
		int n = sc.nextInt();
		Order order = new Order(date,OrderStatus.valueOf(status),client);
		for (int i = 1; i <= n ; i++) {
			System.out.println("Enter "+i + " item data: ");
			System.out.print("Name item:");
			sc.nextLine();
			String nameItem = sc.nextLine();
			System.out.print("Price Item");
			double price = sc.nextDouble();
			System.out.print("Quantity: ");
			Integer quantity = sc.nextInt();
			Product products = new Product(nameItem, price);
			OrderItem orderItem = new OrderItem(quantity,products,price);
			
			order.addItem(orderItem);	
			
		}
		System.out.print(order);
		
		

	}

}
