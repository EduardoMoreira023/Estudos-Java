package oo.heranca.teste;

import oo.heranca.desafio.Brasilia;
import oo.heranca.desafio.Fusca;

public class CarroTeste {
	
	public static void main(String[] args) {
		
		Fusca fusca = new Fusca();
		System.out.println(fusca);
		
		fusca.acelerar();
		fusca.acelerar();
		fusca.acelerar();
		fusca.acelerar();
		fusca.acelerar();

		System.out.println(fusca);
		
		fusca.frear();
		fusca.frear();
		fusca.frear();
		fusca.frear();
		fusca.frear();
		fusca.frear();
		fusca.frear();
		fusca.frear();
		fusca.frear();
		fusca.frear();
		fusca.frear();
		
		System.out.println(fusca);
		
		
		System.out.println();
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println();
		//--------------------------------------------------------------------------------------------------
		
		
		Brasilia brasilia = new Brasilia();
		System.out.println(brasilia);
		brasilia.ligarTurbo();
		brasilia.ligarAr();
		brasilia.desligarAr();
		
		System.out.println(brasilia.velocidadeDoAr());
		
		brasilia.acelerar();
		brasilia.acelerar();
		brasilia.acelerar();
		brasilia.acelerar();
		brasilia.acelerar();
		brasilia.acelerar();
		brasilia.acelerar();
		brasilia.acelerar();
		brasilia.acelerar();
	

		System.out.println(brasilia);
		
		brasilia.frear();
		brasilia.frear();
		brasilia.frear();
		
		System.out.println(brasilia);
	}
	
	

}
