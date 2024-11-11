package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio1 {
	
	//** 1. Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit. */
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite a temperatura em Celcius: ");
		double celsius = entrada.nextDouble();
		
		double conversao = celsius * 1.8 + 32;
		
		System.out.println("Valor em Farenheit: " + conversao);
		
		entrada.close();
	}

}
