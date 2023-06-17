package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employees;

public class Empregados {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		List<Employees> list = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			
			System.out.println();
			System.out.println("Employee #" + (i+1) + ":");
		
			System.out.print("Id: ");
			int id = sc.nextInt();
			
			while (hasId(list, id)) {
				System.out.print("This id has already exist! Try again: ");
				id = sc.nextInt();
			}
			System.out.println();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			Employees emp = new Employees(id, name, salary);
			
			list.add(emp);
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase : ");
		int idEmp = sc.nextInt();
		
		Employees emp =  list.stream().filter(x -> x.getId() == idEmp).findFirst().orElse(null);
		
		if(emp == null) {
			System.out.print("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		
		System.out.println();
		System.out.println("List of Employees:");
		
		for(Employees x: list) {
			
			System.out.println(x);
		}
		
		sc.close();

	}
	public static boolean hasId(List <Employees> list, int id) {
		
		Employees emp =  list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}
