package br.com.cursoja.agendacurso.model.teste;

import br.com.cursoja.agendacurso.entidade.Curso;
import br.com.cursoja.agendacurso.model.dao.Conexao;
import br.com.cursoja.agendacurso.model.dao.CursoDao;

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
		cursoAlterar.setNome("Offices");
		cursoAlterar.setValor(500);
		cursoAlterar.setId(1);
		
		dao.alterar(cursoAlterar);
		
		
		
		System.out.print(cursoAlterar.getId()+"\n \n \n");
		dao.excluir(cursoAlterar);
		
		
		
	}

}
