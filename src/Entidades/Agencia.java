package Entidades;

import java.util.ArrayList;

public class Agencia {

    /***********************
     *                     *
     * Entidade da Agencia *
     *                     *
     ***********************/
	
	//Codigo da Agencia
	private int       cdAgencia;
	//Nome da Agencia
	private String    nmAgencia;
	//Valor da Agencia
	private double    valorAgencia;
	//Endereco da Agencia
	private String    endereco;
	//Caixas Eletronicos de uma Agencia
	private ArrayList CaixaEletronico;
	//Cartoes associados a uma Agencia
	private ArrayList Cartao;
	

	public Agencia() {
	
	}

	public int getCdAgencia() {
		return cdAgencia;
	}


	public void setCdAgencia(int cdAgencia) {
		this.cdAgencia = cdAgencia;
	}


	public String getNmAgencia() {
		return nmAgencia;
	}


	public void setNmAgencia(String nmAgencia) {
		this.nmAgencia = nmAgencia;
	}


	public double getValorAgencia() {
		return valorAgencia;
	}


	public void setValorAgencia(double valorAgencia) {
		this.valorAgencia = valorAgencia;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public ArrayList getCaixaEletronico() {
		return CaixaEletronico;
	}


	public void setCaixaEletronico(ArrayList caixaEletronico) {
		CaixaEletronico = caixaEletronico;
	}


	public ArrayList getCartao() {
		return Cartao;
	}


	public void setCartao(ArrayList cartao) {
		Cartao = cartao;
	}

	
	
}
