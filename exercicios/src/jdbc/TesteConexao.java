package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class TesteConexao {
	
	public static void main(String[] args) throws SQLException {
		
		final String url = "jdbc:mysql://localhost/curso_java?verifyServerCertificate=false&useSSL=true";
		final String usuario = "root";
		final String senha = "40433888";
		
		Connection conexao = DriverManager.getConnection(url, usuario, senha);
		
//		Connection conexao = FabricaConexao.getConexao();
		
		System.out.println("Conexão efetuada com sucesso!");
		conexao.close();
	}

}
