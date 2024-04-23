package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		/** 3. Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC. */
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o peso: ");
		double peso = entrada.nextDouble();
		
		System.out.println("Digite a altura: ");
		double altura = entrada.nextDouble();
		
		double imc = peso / ( altura * altura);
		
		System.out.println("IMC: " + imc);
		
		entrada.close();
	}

}
