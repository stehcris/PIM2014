package BancoDados.DAO;

import BancoDados.DAO.AcessoORACLE.OracleCaixaEletronicoDAO;
import Entidades.CaixaEletronico;

public class CaixaEletronicoDAO {
	
	
	public CaixaEletronico BuscarCaixaEletronico (int cdBdn){
		
		OracleCaixaEletronicoDAO banco = new OracleCaixaEletronicoDAO();
		
		CaixaEletronico caixa = banco.SelectCaixaEletronico(cdBdn);
	
		return  caixa;
	}
	
	public void AtalizarCaixaEletrino(CaixaEletronico  caixaEletronico){
		
		OracleCaixaEletronicoDAO banco = new OracleCaixaEletronicoDAO();
		
		banco.UdateCaixaEletronico(caixaEletronico);
		

	}
	
	
}
