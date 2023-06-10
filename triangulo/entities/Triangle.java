package entities;

public class Triangle {

	public double a; /* atributo a*/
	public double b; /*atributo b */ 
	public double c;  /*atributo c*/ 
	
	public double area() {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
		}
	/* Delegação de responsabilidades: quem deve ser responsável por saber 
como calcular a área de um triângulo é o próprio triângulo. A lógica do cálculo 
da área não deve estar em outro lugar.
*/
}
