package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class ObterUsuario {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		Usuario usuario = em.find(Usuario.class, 5L); //no find primeiro passa a classe(tabela) que foi persistida e a que você quer buscar e depois o valor que quer usar para buscar.
		System.out.println(usuario.getNome());
		
		em.close();
		emf.close();
	}

}
