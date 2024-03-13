package com.banco;

public class Pessoa {
	private int idPessoa;
	private String nome;
	private String Email;
	private PessoaFisica n;
	private PessoaJuridica m;

	public int getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public PessoaFisica getN() {
		return n;
	}

	public void setN(PessoaFisica n) {
		this.n = n;
	}

	public PessoaJuridica getM() {
		return m;
	}

	public void setM(PessoaJuridica m) {
		this.m = m;
	}

	public Pessoa(int idPessoa) {
		// TODO Auto-generated constructor stub
	}
}
