package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		List<Product> list = new ArrayList<>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Product "+ i +" data: ");
			System.out.print("Common, used or imported(c,u,i):  ");
			char select = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			if(select == 'i') {
				System.out.print("Customs Fee: ");
				double customsFee = sc.nextDouble();
				list.add(new ImportedProduct (name, price, customsFee));				
			}else {
				if(select == 'u') {
					System.out.print("Manufacured Date: (dd/MM/yyyy) ");
					sc.nextLine();
					String manufacturedDate = sc.nextLine();
					list.add(new UsedProduct(name,price, sdf.parse(manufacturedDate)));
				}else {
					list.add(new Product(name,price));
				}
			}
		}
		System.out.println("PRICE TAGS: ");
		for (Product pd : list) {	
			System.out.println(pd);
		}
		
		
		sc.close();
	}

}
