package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
	private String name;
	private WorkerLevel level;
	private double baseSalary;
	
	private Department department;
	private List<HourContract> contracts= new ArrayList();
	
	public Worker() {
		
	}
	
	public Worker(String name, WorkerLevel level, double baseSalary, Department department) {
		this.name = name;
		this.baseSalary = baseSalary;
		this.department = department;
		this.level = level;
		
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setLevel(WorkerLevel level) {
		this.level=level;
	}
	public WorkerLevel getLevel() {
		return level;
	}
	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	public double getBaseSalary() {
		return baseSalary;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Department getDepartment() {
		return department;
	}
	
	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}
	public double income(int year, int month) {
		double sum = baseSalary;
		GregorianCalendar calendar = new GregorianCalendar();
		for (HourContract c : contracts ) {			
			calendar.setTime(c.getData());
			int c_year = calendar.get(Calendar.YEAR);
			int c_month = 1 + calendar.get(Calendar.MONTH);
			if (c_year == year && c_month == month) {
				sum += c.totalValue();			}
		}
		return sum;
		
	}
	

}
