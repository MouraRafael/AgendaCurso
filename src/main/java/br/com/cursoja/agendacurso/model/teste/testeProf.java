package br.com.cursoja.agendacurso.model.teste;

import java.util.ArrayList;

import br.com.cursoja.agendacurso.entidade.Professor;

import br.com.cursoja.agendacurso.model.dao.ProfessorDao;

public class testeProf {
	public static void main(String[] args) {
		Professor pp = new Professor();
		
		/*pp.setId(2);
		pp.setNome("Paulo");
		pp.setCelular("21 8845-5556");
		pp.setValorHora(1200);*/
		
		ProfessorDao dao = new ProfessorDao();
		
		
		//Teste Cadastrar C(ok)
		/*dao.cadastrar(p);*/
		
		//Teste SELECT by Id R(ok)
		/*Professor prof = dao.buscar(2);
		System.out.println(prof.getNome());*/
		
		//Teste SELECT listagem(ok)
		/*
		ArrayList<Professor> profs = dao.listar("");
		
		for(Professor p : profs) {
			System.out.println("Id :"+ p.getId()+" - "+ "Nome: "+ p.getNome()+" - "+ "Celular: "+ p.getCelular()+" - "+ "Valor Hora:"+ p.getValorHora());
		}*/
		
		
		//Teste UPDATE (U)(ok)
		/*dao.alterar(pp);*/
		
		
		//Teste Delete (D)(ok)
		/*pp.setId(3);
		dao.excluir(pp);*/
		
	
	}
}	
