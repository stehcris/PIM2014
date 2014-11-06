package BancoDados.DAO.AcessoORACLE;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import BancoDados.Connection.EstatisticaDBManager;
import Entidades.CaixaEletronico;

public class OracleCaixaEletronicoDAO {

    Connection connection = null;
    
    
    
public void UdateCaixaEletronico(CaixaEletronico  caixaEletronico) {

	
	PreparedStatement preparedStatement = null;

	
	try {
		
		String sql = null;
		
		connection = EstatisticaDBManager.obterConexao();

		sql = "UPDATE TB_CAIXA SET  valorBdn  = ?, WHERE cdBdn = ?";
		
		PreparedStatement colocar =connection.prepareStatement(sql);
		
		
		colocar.setDouble(1, caixaEletronico.getValorBdn());
		colocar.setInt(2, caixaEletronico.getCdBdn());
		
		
		colocar.execute();
		
		colocar.close();
	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		try {
			
			connection.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
}


public CaixaEletronico SelectCaixaEletronico(int cdBdn){
	
	
	PreparedStatement stmt = null;
	ResultSet rs = null;
	CaixaEletronico caixa = new CaixaEletronico();
	
	try {
		connection =  EstatisticaDBManager.obterConexao();
		
		String sql = "SELECT VALORBDN, ENDRECOBDN FROM TB_CAIXA WHERE CDBDN = ?";
		
		stmt = connection.prepareStatement(sql);
		
		stmt.setInt(1, cdBdn);
		
		rs = stmt.executeQuery();
		
		if(rs.next()) {
			caixa.setCdBdn(cdBdn);
			caixa.setValorBdn(rs.getDouble("VALORBDN"));
			caixa.setEndenrecoBdn(rs.getString("ENDRECOBDN"));
		}
		
	} catch(Exception e) {
		e.printStackTrace();
	} finally {
		
		try {
			rs.close();
			stmt.close();
			connection.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	return caixa;
}



	
}
