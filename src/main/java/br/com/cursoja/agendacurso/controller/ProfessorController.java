package br.com.cursoja.agendacurso.controller;

import java.util.ArrayList;

import br.com.cursoja.agendacurso.entidade.Professor;
import br.com.cursoja.agendacurso.model.dao.ProfessorDao;

public class ProfessorController {
	ProfessorDao dao = new ProfessorDao();

	public void cadastrar(Professor p){
		dao.cadastrar(p);
	}

	public Professor buscar (Long id){
		return dao.buscar(id);
	}

	public ArrayList<Professor> listar (String nome){
		return dao.listar(nome);
	}

	public void alterar(Professor p){
		dao.alterar(p);
	}

	public void excluir(Professor p){
		dao.excluir(p);
	}
	
}
