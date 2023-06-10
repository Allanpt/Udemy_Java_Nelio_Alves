package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class membrosEstaticos {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		
		double radius = sc.nextDouble();
		double c = Calculator.circumference(radius); /*'Calculator' � a classe que n�o precisa de objetos pois o resultado ser� o mesmo */
		double v = Calculator.volume(radius);/*'Calculator' � uma classe est�tica tbm */ 
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculator.PI);
		
		sc.close();
		
	}

}
