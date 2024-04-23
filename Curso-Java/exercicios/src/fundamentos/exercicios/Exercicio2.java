package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Fahrenheit: ");
		double fahrenheit = entrada.nextDouble();
		
		//double conversao = fahrenheit * 1.8 + 32;
		double conversao = (fahrenheit - 32) / 1.8;
		
		System.out.println("Valor em Celsius: " + conversao);
		
		entrada.close();
		

	}

}
