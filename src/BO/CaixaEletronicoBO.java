package BO;

import BancoDados.DAO.CaixaEletronicoDAO;
import Entidades.CaixaEletronico;

public class CaixaEletronicoBO {

    /***************************************
     *                                     *
     * Funcoes da entidade CaixaEletronico *
     *                                     *
     ***************************************/
	
	public CaixaEletronico BucarCaixaEletronico(int cdBdn){
		
		CaixaEletronicoDAO caixaDAO = new CaixaEletronicoDAO();
					
		CaixaEletronico  caixaEletronico = caixaDAO.BuscarCaixaEletronico(cdBdn);
			
		return caixaEletronico; 
	}

	
	
	
	public void AtalizarCaixaEletrino(CaixaEletronico  caixaEletronico){
		
		CaixaEletronicoDAO caixaDAO = new CaixaEletronicoDAO();
		caixaDAO.AtalizarCaixaEletrino(caixaEletronico);

	}
	
	
}
