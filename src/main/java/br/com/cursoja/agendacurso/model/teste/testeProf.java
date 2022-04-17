package br.com.cursoja.agendacurso.model.teste;

import br.com.cursoja.agendacurso.entidade.Professor;
import br.com.cursoja.agendacurso.model.dao.Conexao;
import br.com.cursoja.agendacurso.model.dao.ProfessorDao;

public class testeProf {
	public static void main(String[] args) {
		Conexao c = new Conexao();
		c.getConexao();
		c.fecharConexao();
		
		Professor p = new Professor();
		
		p.setId(2);
		p.setNome("Paulo");
		p.setCelular("21 88455555");
		p.setValorHora(1200);
		
		ProfessorDao dao = new ProfessorDao();
		
		System.out.println(p.getCelular());
		//Teste Cadastrar(ok)
		/*dao.cadastrar(p);*/
	
	}
}	
