package modelo.heranca;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("AB") //ele cria uma unica tabela colocando o tipo declarado nessa anotação
public class AlunoBolsista extends Aluno {
	
	private double valorBolsa;
	
	public AlunoBolsista() {
		// TODO Auto-generated constructor stub
	}

	public AlunoBolsista(Long matricula, String nome, double valorBolsa) {
		super(matricula, nome);
		this.valorBolsa = valorBolsa;
		// TODO Auto-generated constructor stub
	}

	public double getValorBolsa() {
		return valorBolsa;
	}

	public void setValorBolsa(double valorBolsa) {
		this.valorBolsa = valorBolsa;
	}
	
	
	

}
