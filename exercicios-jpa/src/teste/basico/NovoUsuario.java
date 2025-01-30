package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class NovoUsuario {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");//responsavel por criar um entitymanager caso queira varias conexões ele que irá ser responsavel por gerenciar todas elas.
																							// e vc passa para ele a unidade de persistencia declarada no persistence.xml
		
		EntityManager em = emf.createEntityManager(); //faz alteração, exclusão, consulta e tbm representa uma conexão.
		
		
		Usuario novoUsuario = new Usuario("diego", "diego@gmail.com"); 
		
		//sempre ter q ter uma transação em caso de inserção, mas em consulta não necessita
		
		em.getTransaction().begin(); // responsavel por abrir uma transação 
		em.persist(novoUsuario); //persiste as informações
		em.getTransaction().commit(); // envia a para o banco transação 
		
		System.out.println("O Id gerado foi: " + novoUsuario.getId()); 
		
		em.close();
		emf.close();
	}

}
