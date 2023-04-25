package com.banco;

public class PessoaJuridica {
	private Object tipoEmpresa;
	private String cnpj;
	private String inscricao;
	private String site;
	public PessoaJuridica(int idPessoa, Object tipoEmpresa) {
		// TODO Auto-generated constructor stub
	}
	public Object getTipoEmpresa() {
		return tipoEmpresa;
	}
	public void setTipoEmpresa(Object tipoEmpresa) {
		this.tipoEmpresa = tipoEmpresa;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getInscricao() {
		return inscricao;
	}
	public void setInscricao(String inscricao) {
		this.inscricao = inscricao;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}

}
