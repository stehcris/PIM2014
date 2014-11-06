package Entidades;

import java.util.ArrayList;

public class Banco {

    /*********************
     *                   *
     * Entidade do Banco *
     *                   *
     *********************/
	
	//Codigo do Banco
	private int       cdBanco;
	//Nome do Banco
	private String    nmBanco;
	//Agencias do Banco
	private ArrayList Agencia;
	
	public Banco() {

	}


	public int getCdBanco() {
		return cdBanco;
	}

	public void setCdBanco(int cdBanco) {
		this.cdBanco = cdBanco;
	}

	public String getNmBanco() {
		return nmBanco;
	}

	public void setNmBanco(String nmBanco) {
		this.nmBanco = nmBanco;
	}

	public ArrayList getAgencia() {
		return Agencia;
	}

	public void setAgencia(ArrayList agencia) {
		Agencia = agencia;
	}
	
	
}
