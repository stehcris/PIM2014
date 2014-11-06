package Negocio;

import BO.ClienteBO;
import Entidades.Cliente;

public class Sacar {

	public String SacarConta(Cliente cliente,double vlrSaque){
		String mensaguem = " ";

		ClienteBO clienteBO = new ClienteBO();
		cliente = clienteBO.BuscarCliente(cliente.getCdCliente());

		if  (vlrSaque > cliente.getVlrCliente()){
			mensaguem = "Valor Indisponivel na Conta";
			return mensaguem;
		}else {
			double tot = vlrSaque - cliente.getVlrCliente();					
			cliente.setVlrCliente(tot);
		}
		clienteBO.AtalizarCliente(cliente);
		mensaguem = "Saque efetuado com sucesso";

		return mensaguem;
	}
}