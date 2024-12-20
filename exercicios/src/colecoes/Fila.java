package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		// Ofer e Add -> adicionam elementos na fila
		// A diferença de comportamento é quando a fila está cheia!
		
		fila.add("Ana"); // Lança uma exceção
		fila.offer("Bia"); // Retorna false
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		// Peek e Element -> obter o próximo elemento da fila (sem remover)
		// A diferença ocorre quando a fila está vazia!
		System.out.println(fila.peek()); // retorna null
		System.out.println(fila.peek());
		System.out.println(fila.element()); // Lança uma exceção
		System.out.println(fila.element());
		
	
		
		// Poll e Remove -> obter o próximo elemento da fila e remove!
		// A diferença ocorre quando a fila está vazia!
		System.out.println(fila.poll()); // retorna null
		System.out.println(fila.remove()); // Lança uma exceção
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());
			
		
		
		// fila.size();
		// fila.clear();
		// fila.isEmpty();
		// fila.contains(...);
		
	}

}
