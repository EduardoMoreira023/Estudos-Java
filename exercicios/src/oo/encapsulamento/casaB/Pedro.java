 package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {
	
void testeAcessos() {
		
		// segredo
		// facoDentroDeCasa
		// formaDeFalar
		// todosSabem
		
		//Ana mae = new Ana(); NÃO PRECISA CRIAR UMA ANA, POIS TUDO SERÁ RECEBIDO POR HERANÇA E ACESSADO DIRETAMENTE!
		
		// System.out.println(segredo);
		// System.out.println(facoDentroDeCasa);
		System.out.println(formaDefalar);
		System.out.println(todosSabem);
		System.out.println(new Ana().todosSabem);
		
			
		}

}
