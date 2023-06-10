package app;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAccout;

public class ContaBancaria {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int accoutNumber = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		
		System.out.print("Is there na initial deposit (y/n)? ");
		String yn = sc.nextLine();
		
		BankAccout contaBancaria;
		double initialDeposit = 0;
		
		if (yn.equals("y")) {
			
			System.out.print("Enter initial deposit value: ");
			initialDeposit = sc.nextDouble();
			
			contaBancaria = new BankAccout(accoutNumber, name, initialDeposit);
			
		} else if (yn.equals("n")){
			
			contaBancaria = new BankAccout(accoutNumber, name);
			
		} else {
			
			System.out.println("Invalid input.");
            sc.close();
            return;
		}
		System.out.println();
		System.out.println("Accout data: ");
		System.out.println(contaBancaria);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		
		contaBancaria.deposit(deposit);
		
		contaBancaria.Update();
        System.out.println(contaBancaria);
		
        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        
        contaBancaria.withdraw(withdraw);
        
        contaBancaria.Update();
        System.out.println(contaBancaria);
        
		sc.close();
	}
}
