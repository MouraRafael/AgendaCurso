package br.com.cursosja.agendacurso;


import java.util.ArrayList;

import br.com.cursoja.agendacurso.model.dao.Conexao;
import br.com.cursoja.agendacurso.model.dao.CursoDao;

public class TesteSelect {
	public static void main(String[] args) {
	
		
		CursoDao dao = new CursoDao();
		
		ArrayList<Curso> cursos = dao.listar("");
		
		for(Curso a : cursos) {
			System.out.println(a.getNome());
		}
		
		
		Curso unico = dao.buscar(1);
		
		System.out.println(unico.getNome());
	}
}
