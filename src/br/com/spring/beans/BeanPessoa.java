package br.com.spring.beans;

public class BeanPessoa {

	private String nome;
	private String email;

	public BeanPessoa(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "BeanPessoa [nome=" + nome + ", email=" + email + "]";
	}

}
