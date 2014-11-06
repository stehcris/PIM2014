package BancoDados.DAO;

import BancoDados.DAO.AcessoORACLE.OracleClienteDAO;
import Entidades.Cliente;

public class ClienteDAO {

	public Cliente buscarCliente(int cdCliente) {
		
		
		OracleClienteDAO banco = new OracleClienteDAO();
		Cliente cliente = banco.SelectCliente(cdCliente);
		
		return cliente;
		
	}

	public void AtalizarCliente(Cliente cliente) {

		OracleClienteDAO banco = new OracleClienteDAO();
		
		banco.UdateCliente(cliente);
		
		
	}

	
}
