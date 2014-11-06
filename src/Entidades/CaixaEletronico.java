package Entidades;

public class CaixaEletronico {


    /********************************
     *                              *
     * Entidade do Caixa eletronico *
     *                              *
     ********************************/
	
	//Codigo do caixa eletronico
	private int    cdBdn;
	//Valor de um Caixa Eletronico
	private double valorBdn;
	//Endereco de um caixa eletronico
	private String endenrecoBdn;
	
	
	public CaixaEletronico() {

		
	}

	public int getCdBdn() {
		return cdBdn;
	}



	public void setCdBdn(int cdBdn) {
		this.cdBdn = cdBdn;
	}



	public double getValorBdn() {
		return valorBdn;
	}



	public void setValorBdn(double valorBdn) {
		this.valorBdn = valorBdn;
	}



	public String getEndenrecoBdn() {
		return endenrecoBdn;
	}



	public void setEndenrecoBdn(String endenrecoBdn) {
		this.endenrecoBdn = endenrecoBdn;
	}


	
	
}
