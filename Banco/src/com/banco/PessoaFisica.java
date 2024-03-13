package com.banco;

public class PessoaFisica extends Pessoa {

	private static final int idPessoa = 01;
	//atributos
	private String cpf;
	private String rg;
	private Object cargo;
	private double salario; 
	
	public PessoaFisica(){
		super(idPessoa);
        /* TODO Auto-generated constructor stub */
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Object getCargo() {
		return cargo;
	}

	public void setCargo(Object cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}