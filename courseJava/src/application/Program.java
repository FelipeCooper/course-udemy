package application;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {
	public static void main (String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
		
		System.out.print("Enter department's name: ");
		String department = sc.nextLine();
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Level: ");
		String level = sc.nextLine();
		System.out.print("Base Salary: ");
		Double baseSalary = sc.nextDouble();
		Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Department(department));
		
		System.out.print(" How many contracts this work? ");
		int n = sc.nextInt();
		for (int i = 1 ;i <= n; i++) {
			System.out.print("Date: ");
			Date contractDate =  (Date) sdf.parse(sc.next());
			System.out.print("Value per hour: ");
			double value = sc.nextDouble();
			System.out.print("Duration(Hours): ");
			int duration = sc.nextInt();
			HourContract contract = new HourContract(contractDate,value,duration);
			worker.addContract(contract);
		}
		System.out.print(" Enter month and year to calculate income (MM/YYYY): ");
		String incomeDate = sc.next();
		int incomeMonth = Integer.parseInt(incomeDate.substring(0,2));
		int incomeYear = Integer.parseInt(incomeDate.substring(3));
		
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: "+ worker.getDepartment().getName());
		System.out.println("Salary $ " + worker.income(incomeYear, incomeMonth));
		
		
	}

}
