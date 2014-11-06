package Entidades;

public class Cliente {

    /***********************
     *                     *
     * Entidade do Cliente *
     *                     *
     ***********************/
	
	//codigo do Cliente
	private int cdCliente;
    //Senha do Cliente
	private String senha;
	private String agencia;
	private String conta;
	//valor do Cliente
	private double vlrCliente;
	//Nome do Cliente
	private String nmCliente;
	
	public int getCdCliente() {
		return cdCliente;
	}
	public void setCdCliente(int cdCliente) {
		this.cdCliente = cdCliente;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getConta() {
		return conta;
	}
	public void setConta(String conta) {
		this.conta = conta;
	}
	public double getVlrCliente() {
		return vlrCliente;
	}
	public void setVlrCliente(double vlrCliente) {
		this.vlrCliente = vlrCliente;
	}
	public String getNmCliente() {
		return nmCliente;
	}
	public void setNmCliente(String nmCliente) {
		this.nmCliente = nmCliente;
	}
	
}
