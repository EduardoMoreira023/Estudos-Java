package oo.heranca.desafio;

public class Brasilia extends Carro implements Esportivo, Luxo{
	
	private boolean ligarTurbo;
	private boolean ligarAr;
	
	public Brasilia() {
		this(315);
	}
	
	
	public Brasilia(int velocidadeMaxima) {
		super(velocidadeMaxima);
		setDelta(15);

	}
	
	@Override
	public void ligarTurbo() {
		ligarTurbo = true;
	}
	
	@Override
	public void desligarTurbo() {
		ligarTurbo = false;
	}
	
	@Override
	public void ligarAr() {
		ligarAr = true;
	}
	
	@Override
	public void desligarAr() {
		ligarAr = false;
	}
	
	@Override
	public int getDelta() {
		if(ligarTurbo && !ligarAr) {
			return 35;
		} else if(ligarTurbo && ligarAr) {
			return 30;
		} else if(!ligarTurbo && !ligarAr) {
			return 20;
		} else {
			return 15;	
		}
		
	}
	
//	@Override
//	public void acelerar() {
//		velocidadeAtual += 15;
//	}
	
	// OBS: CASO QUEIRA SOBRESCREVER UM MÉTODO VC NUNCA PODE DIMINUIR O NIVEL DE VISIBILIDADE SÓ ALMENTAR O NIVEÇ, 
	//POR EX: DE PROTECTED PRA PUBLIC OK,JÁ DE PUBLIC PRA PROTECTED NÃO VAI!!!
//	
	public String toString() {
		return "A velocidade atual é: " + velocidadeAtual + "Km/h.";
	}

}
