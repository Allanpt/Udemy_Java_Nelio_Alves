package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class ProblemaRetangulo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle retangulo = new Rectangle();
		
		System.out.println("Enter rectangle width and height: ");
		retangulo.width = sc.nextDouble();
		retangulo.height = sc.nextDouble();
		
		double areaRetangulo = retangulo.area();
		double perimetroRetangulo = retangulo.perimeter();
		double diagonalRetangulo = retangulo.diagonal();
		
		System.out.println("AREA = " + String.format("%.2f", areaRetangulo));
		System.out.println("PERIMETER = " + String.format("%.2f", perimetroRetangulo));
		System.out.println("DIAGONAL = " + String.format("%.2f", diagonalRetangulo));
		
		sc.close();
	}

}
