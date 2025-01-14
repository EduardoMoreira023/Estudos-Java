package teste.basico;

import infra.DAO;
import modelo.basico.Produto;

public class NovoProduto {

	public static void main(String[] args) {

		Produto produto = new Produto("monitor", 789.98);
		
		DAO<Produto> dao = new DAO<>(Produto.class);
		dao.abrirT().incluir(produto).fecharT();
		
		//dao.incluirAtomico(produto).fechar();
		
	}

}
