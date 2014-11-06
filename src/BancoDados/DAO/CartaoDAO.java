package BancoDados.DAO;

import BancoDados.DAO.AcessoORACLE.OracleCartaoDAO;
import Entidades.Cartao;

public class CartaoDAO {

	
	public Cartao BuscarCartao (int cdCartao){
		
		OracleCartaoDAO banco = new OracleCartaoDAO();
		
		Cartao cartao = banco.SelectCartao(cdCartao);
		
		
		return cartao;
	}
	
	
	
}
