package br.com.cursoja.agendacurso.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.cursoja.agendacurso.entidade.Usuario;

public class UsuarioDao extends Conexao {
	
	public Usuario buscarUsuario(String login, String senha) {
		Usuario usr = null;
		
		try {
			String sql = "SELECT * from usuario WHERE login = ? AND senha = ?";
			
			PreparedStatement ps = getConexao().prepareStatement(sql) ;
			ps.setString(1, login);
			ps.setString(2, senha);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				usr = new Usuario();
				usr.setId(rs.getLong(1));//esse 1 representa o número da coluna
				usr.setNome(rs.getString(2));
				usr.setLogin(rs.getString(3));
			}
			
		}catch(SQLException e) {
			System.out.println("Erro na Consulta");
		}
		finally{
				fecharConexao();
		};
		
		return usr;
	}
}
