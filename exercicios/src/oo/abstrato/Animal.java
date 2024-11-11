package oo.abstrato;

public abstract class Animal {
	
	public String respirar() {
		return "Usando Oxigênio";
	}
	
	
	// Obs: uma opção...
	
//	public double mover() {
//		return 0;
//	}
	
	// Outra opção, pórem pro metodo ser abstrato, a classe tbm precisa ser abstrata!!!
	public abstract String mover();

}
