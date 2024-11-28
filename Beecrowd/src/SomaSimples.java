import java.io.IOException;
import java.util.Scanner;

public class SomaSimples {
	
	public static void main(String[] args) throws IOException {
		
		// Cria um scanner para leitura dos dados de entrada
        Scanner scanner = new Scanner(System.in);

        // Lê os valores inteiros de A e B
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        // Calcula a soma
        int SOMA = A + B;

        // Exibe o resultado no formato solicitado
        System.out.println("SOMA = " + SOMA);

        // Fecha o scanner
        scanner.close();
	}

}
