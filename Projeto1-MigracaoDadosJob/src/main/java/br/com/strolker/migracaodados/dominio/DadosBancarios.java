package br.com.strolker.migracaodados.dominio;

public class DadosBancarios {
	private int id;
	private int idPessoa;
	private int agencia;
	private int conta;
	private int banco;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdPessoa() {
		return idPessoa;
	}
	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {
		this.conta = conta;
	}
	public int getBanco() {
		return banco;
	}
	public void setBanco(int banco) {
		this.banco = banco;
	}
	
	@Override
	public String toString() {
		return "DadosBancarios [id=" + id + ", idPessoa=" + idPessoa + ", agencia=" + agencia + ", conta=" + conta
				+ ", banco=" + banco + "]";
	}
	
}
