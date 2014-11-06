package BO;

import BancoDados.DAO.ClienteDAO;
import Entidades.Cliente;

public class ClienteBO {

	
    /***************************************
     *                                     *
     * Funcoes da entidade Cliente         *
     *                                     *
     ***************************************/
	
	public Cliente BuscarCliente (int cdCliente){
		
		ClienteDAO banco = new ClienteDAO();
		Cliente cliente = banco.buscarCliente(cdCliente);
		
		return cliente;
	}
	
	
	public void AtalizarCliente(Cliente cliente){
		
		ClienteDAO banco = new ClienteDAO();
		banco.AtalizarCliente(cliente);
		
		
		
		
	}
	
	
}
