package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilterEduardo {
	
	public static void main(String[] args) {
		
		Pessoas p1 = new Pessoas("Eduardo", 24);
		Pessoas p2 = new Pessoas("Manoel", 58);
		Pessoas p3 = new Pessoas("Zenida", 56);
		Pessoas p4 = new Pessoas("Thiago", 23);
		
		List<Pessoas> pessoa = Arrays.asList(p1, p2, p3, p4);
		
		Predicate<Pessoas> maisVelhas = mv -> mv.idade >=50;
		Predicate<Pessoas> maisNovas = mn -> mn.idade <=50;
		
		Function<Pessoas, String> melhorIdade = mi -> "Parabéns " + mi.nome + ", você tem " + mi.idade + " e já chegou a melhor idade!!!\n";
		Function<Pessoas, String> aindaJovem = aj -> "Parabéns " + aj.nome + ", você tem " + aj.idade + " e ainda está na juventude ;D\n";
		
		pessoa.stream().filter(maisVelhas).map(melhorIdade).forEach(System.out::println);
		pessoa.stream().filter(maisNovas).map(aindaJovem).forEach(System.out::println);
	}

}
