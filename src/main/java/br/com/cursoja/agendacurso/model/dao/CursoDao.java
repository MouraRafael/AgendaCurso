package br.com.cursoja.agendacurso.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.cursoja.agendacurso.entidade.Curso;

public class CursoDao extends Conexao {
	public void cadastrar (Curso c) {
		String sql = "INSERT INTO curso "
				+ "(nome, valor) VALUES"
				+ "(?,?)";
		
		try {
			PreparedStatement ps = getConexao().prepareStatement(sql);
			ps.setString(1, c.getNome());
			ps.setDouble(2,c.getValor());
			ps.execute();
			
			}catch(SQLException e) {
				System.out.print("Erro");
				e.printStackTrace();
			}finally{
				fecharConexao();
			}
	}
	
	
	
	public void alterar(Curso c) {
		String sql = "UPDATE curso SET "
				+ "nome = ?, "
				+ "valor = ? "
				+ "WHERE idcurso = ?";
		
		try {
			PreparedStatement ps = getConexao().prepareStatement(sql);
			ps.setString(1, c.getNome());
			ps.setDouble(2, c.getValor());
			ps.setLong(3, c.getId());
			
			ps.execute();
		}catch(SQLException e) {
			System.out.print("Erro");
			e.printStackTrace();
		}finally{
			fecharConexao();
		}
	}
	
	
	
	
	
	//Retrive
	public ArrayList<Curso> listar(String nomebusca){
		ArrayList<Curso> lista = new ArrayList<Curso>();
		
		String sql = "SELECT * FROM curso "
				+ "WHERE nome LIKE ?";
		
		try {
			PreparedStatement ps = getConexao().prepareStatement(sql);
			ps.setString(1, "%"+nomebusca+"%");
			
			ResultSet rs = ps.executeQuery();
			Curso c;
			
			while(rs.next()) {
				c = new Curso();
				c.setId(rs.getLong("idcurso"));
				c.setNome(rs.getString("nome"));
				c.setValor(rs.getDouble("valor"));
				
				lista.add(c);
			}
			
			
		}catch(SQLException e) {
			System.out.print("Erro ao lsitar");
		}finally {
			fecharConexao();
		}
		
		return lista;
	}
	
	
	
		//buscar
	public Curso buscar(long nomebusca){
		Curso curso = null;
		
		String sql = "SELECT * FROM curso "
				+ "WHERE idcurso = ?";
		
		try {
			PreparedStatement ps = getConexao().prepareStatement(sql);
			ps.setLong(1, nomebusca);
			
			ResultSet rs = ps.executeQuery();
			
			
			if(rs.next()) {
				curso = new Curso();
				curso.setId(rs.getLong("idcurso"));
				curso.setNome(rs.getString("nome"));
				curso.setValor(rs.getDouble("valor"));
				
				
			}
			
			
		}catch(SQLException e) {
			System.out.print("Erro ao lsitar");
		}finally {
			fecharConexao();
		}
		
		return curso;
	}
	//Delete
	public void excluir(Curso c) {
		String sql = "DELETE FROM curso WHERE idcurso = ?";
		
		try {
			PreparedStatement ps = getConexao().prepareStatement(sql);
			ps.setLong(1, c.getId());
			
			ps.execute();
		}
		catch(SQLException e) {
			System.out.println("Erro na exclus�o");
			e.printStackTrace();
		}
		finally {
			fecharConexao();
		}
	}
}


