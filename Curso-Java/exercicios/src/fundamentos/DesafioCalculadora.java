package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o número: ");
		double num1 = entrada.nextDouble();
		
		System.out.println("Informe o número: ");
		double num2 = entrada.nextDouble();
		
		System.out.println("Informe operação: ");
		String opr = entrada.next();
		
		// Lógica
		double resultado = "+".equals(opr) ? num1 + num2 : 0;
		resultado = "-".equals(opr) ? num1 - num2 : resultado;
		resultado = "*".equals(opr) ? num1 * num2 : resultado;
		resultado = "/".equals(opr) ? num1 / num2 : resultado;
		resultado = "%".equals(opr) ? num1 % num2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, opr, num2, resultado);
		
		
		entrada.close();
		
		
		
		
		
		

		
		
		

		
		
		
		
		
		
		
		
	}

}
