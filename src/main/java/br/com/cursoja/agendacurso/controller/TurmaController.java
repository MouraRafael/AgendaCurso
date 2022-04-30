package br.com.cursoja.agendacurso.controller;

import java.util.ArrayList;

import br.com.cursoja.agendacurso.entidade.Turma;
import br.com.cursoja.agendacurso.model.dao.TurmaDao;

public class TurmaController {
	TurmaDao dao = new TurmaDao();
	public ArrayList<Turma> listar(){
		return dao.listar();
	}
}
