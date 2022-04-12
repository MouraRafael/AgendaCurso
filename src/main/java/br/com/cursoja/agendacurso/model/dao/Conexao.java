package br.com.cursoja.agendacurso.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	private String caminho = "jdbc:mysql://localhost:3306/cursoja";
	private String usuario = "root";
	private String senha = "";
	
	private Connection conn = null;
	
	//Método Conectar
	public Connection getConexao() {
		
		try {
		//Class.forName("com.mysql.jdbc.Driver");
			Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.print("Conectado com sucesso");
		
		conn = DriverManager.getConnection(caminho,usuario,senha);
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
			System.out.print("Não encontrou o driver");
		}
		catch (SQLException e) {
			e.printStackTrace();
			System.out.print("Erro ao conectar ao banco");
		}
		return conn;
		
		
	}
	
	//Método fechar conexão	
	public void fecharConexao() {
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
