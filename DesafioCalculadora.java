package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		double numero1 = entrada.nextDouble();
		
		System.out.print("Digite outro numéro: ");
		double numero2 = entrada.nextDouble();
		
		System.out.print("Digite o sinal aritmético: ");
		String op = entrada.next();
		
		double resultado = "+".equals(op) ? numero1 + numero2 : 0;
		resultado = "-".equals(op) ? numero1 - numero2 : resultado;
		resultado = "*".equals(op) ? numero1 * numero2 : resultado;
		resultado = "/".equals(op) ? numero1 / numero2 : resultado;
		

		System.out.printf("%.2f %s %.2f = %.2f", numero1, op, numero2, resultado);
		entrada.close();
	}

}
