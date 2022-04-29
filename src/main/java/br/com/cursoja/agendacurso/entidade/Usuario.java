package br.com.cursoja.agendacurso.entidade;

public class Usuario {
	private long id;
	private String nome;
	private String login;
	private String senha;
	
	
	public String getLogin() {
		return login;
	}
	
	public long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public String getSenha() {
		return senha;
	}
	
	
	public void setLogin(String login) {
		this.login = login;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
