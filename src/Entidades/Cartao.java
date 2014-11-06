package Entidades;

public class Cartao {

    /***********************
     *                     *
     * Entidade do Cartao  *
     *                     *
     ***********************/
	
	//Numero do cartao
	private int     cdCartao;
	//Cliente associado ao cartao
	private Cliente cliente;
	//Tipo cartao:
	//1 - Corrente; 2- Poupanca
	private int     tipo;
	
	public Cartao() {

	}
	
	public int getCdCartao() {
		return cdCartao;
	}

	public void setCdCartao(int cdCartao) {
		this.cdCartao = cdCartao;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
}
