package util;

public class CurrencyConverter {
	
	public static double IOF = (6.0/100);
	
	public static double dollarInReais(double dollar, double quantity) {
		return dollar * (1 + IOF) * quantity;
	}
}
