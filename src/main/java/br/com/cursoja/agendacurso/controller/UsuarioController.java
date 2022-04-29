package br.com.cursoja.agendacurso.controller;

import br.com.cursoja.agendacurso.entidade.Usuario;
import br.com.cursoja.agendacurso.model.dao.UsuarioDao;

public class UsuarioController {
	
	UsuarioDao dao = new UsuarioDao();
	
	public Usuario logar  (String login, String senha) {
		
		return dao.buscarUsuario(login, senha);
	}
}
