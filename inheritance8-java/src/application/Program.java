package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Contributor;
import entities.JuridicalPerson;
import entities.NaturalPerson;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List <Contributor> contributor = new ArrayList();
		
		
		System.out.print("Enter the number of tax payers:");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			
			System.out.println("Tax Payers " +i + " data: ");
			System.out.print("Individual or company (i/c)?");
			char type = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Annual Income: ");
			double annualIncome = sc.nextDouble();
			
			if (type == 'i') {
				System.out.print("Healt expenditure: ");
				double healtExpenditure = sc.nextDouble();
				contributor.add(new NaturalPerson(name,annualIncome,healtExpenditure));
				
			}else {
				System.out.print("Employees: ");
				int employees = sc.nextInt();
				contributor.add(new JuridicalPerson(name,annualIncome,employees));
			}				
		}
		System.out.println("TAX PAYEDS:");
		double total = 0;
		for(Contributor c : contributor) {
		System.out.printf("%s $  %.2f %n", c.getName() , c.taxLevied() );
		total += c.taxLevied();
		}
		System.out.printf("TOTAL TAXES: $ %.2f ",total);
		
		
		
		sc.close();
	}

}
