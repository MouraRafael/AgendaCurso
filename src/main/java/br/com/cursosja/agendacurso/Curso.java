package br.com.cursosja.agendacurso;

public class Curso {
	private long id;
	private String nome;
	private double valor;
	
	//Getter
	public long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public double getValor() {
		return valor;
	}
	
	
	//Setters
	public void setId(long id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	
}
