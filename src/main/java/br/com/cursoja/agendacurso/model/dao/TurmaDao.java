package br.com.cursoja.agendacurso.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.cursoja.agendacurso.entidade.Curso;
import br.com.cursoja.agendacurso.entidade.Professor;
import br.com.cursoja.agendacurso.entidade.Turma;

public class TurmaDao extends Conexao {
	public ArrayList<Turma> listar(){
		ArrayList<Turma> lista = new ArrayList<Turma>();
		try {
			String sql = "Select * from turma ORDER BY datainicio";
			
			PreparedStatement ps = getConexao().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			Turma t = null;
			Curso c = null;
			Professor p = null;
			
			while (rs.next()) {
				t = new Turma();
				t.setId(rs.getLong("idturma"));
				t.setDataInicio(rs.getDate("datainicio"));
				t.setDataFim(rs.getDate("datafim"));
				
				c = new Curso();
				c.setId(rs.getLong("curso_id"));
				t.setCurso(c);
				
				p = new Professor();
				p.setId(rs.getLong("professor_id"));
				t.setProfessor(p);
				
				lista.add(t);
				
			}
			
		}catch(SQLException e) {
			System.out.print("Erro de consulta");
		}
		
		return lista;
	}
}
