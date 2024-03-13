package com.banco;

public class ContaPF extends Conta{
	private PessoaFisica titularConta;

	public ContaPF(int numAg, int numConta, double saldo){

		super(numAg, numConta, saldo);
		// TODO Auto-generated constructor stub
	}
	public PessoaFisica getTitularConta() {
		return titularConta;
	}
	public void setTitularConta(PessoaFisica titularConta) {
		this.titularConta = titularConta;
	}
}