package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Products;



public class Produtos {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Products product = new Products();
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		
		System.out.print("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
		System.out.println();
		System.out.println("Product data: " + product); /*Por padr�o o c�digo em java reconhece o m�todo toString() */
		
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantidade = sc.nextInt();
		product.addProducts(quantidade);
		
		System.out.println();
		System.out.println("Uptade data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantidade = sc.nextInt();
		product.removeProducts(quantidade);
		
		System.out.println();
		System.out.println("Uptade data: " + product);
		
		sc.close();
	}

}
