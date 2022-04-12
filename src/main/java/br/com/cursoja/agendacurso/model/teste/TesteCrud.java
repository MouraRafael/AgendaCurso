package br.com.cursoja.agendacurso.model.teste;

import br.com.cursoja.agendacurso.model.dao.Conexao;
import br.com.cursoja.agendacurso.model.dao.CursoDao;
import br.com.cursosja.agendacurso.Curso;

public class TesteCrud {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		Conexao c = new Conexao();
		c.getConexao();	
		
		c.fecharConexao();
		
		
		Curso curso = new  Curso();
		/*curso.setNome("Word");
		curso.setValor(300);*/
		
		CursoDao dao = new CursoDao();
		//dao.cadastrar(curso);
		
		
		Curso cursoAlterar = new Curso();
		cursoAlterar.setNome("Office");
		cursoAlterar.setValor(500);
		cursoAlterar.setId(1);
		
		dao.alterar(cursoAlterar);
		
		
		
		
		
	}

}
