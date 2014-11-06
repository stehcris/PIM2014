package BO;

import BancoDados.DAO.CartaoDAO;
import Entidades.Cartao;

public class CartaoBO {

	
    /***************************************
     *                                     *
     * Funcoes da entidade Cartao          *
     *                                     *
     ***************************************/
	
	public Cartao BuscarCatao(int cdCartao) {
		
		CartaoDAO banco = new CartaoDAO();
		
		Cartao cartao = banco.BuscarCartao(cdCartao);
		
		return cartao;
		
	}
	
	
}
