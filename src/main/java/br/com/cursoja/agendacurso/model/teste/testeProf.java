package br.com.cursoja.agendacurso.model.teste;

import br.com.cursoja.agendacurso.entidade.Professor;

import br.com.cursoja.agendacurso.model.dao.ProfessorDao;

public class testeProf {
	public static void main(String[] args) {
		Professor p = new Professor();
		
		/*p.setId(2);
		p.setNome("Paulo");
		p.setCelular("21 88455555");
		p.setValorHora(1200);*/
		
		ProfessorDao dao = new ProfessorDao();
		
		
		//Teste Cadastrar C(ok)
		/*dao.cadastrar(p);*/
		
		//Teste SELECT by Id R(ok)
		Professor prof = dao.buscar(2);
		System.out.println(prof.getNome());
		
		
	
	}
}	
