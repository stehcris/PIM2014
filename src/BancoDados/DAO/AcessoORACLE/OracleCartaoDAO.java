package BancoDados.DAO.AcessoORACLE;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import BancoDados.Connection.EstatisticaDBManager;
import Entidades.Cartao;
import Entidades.Cliente;

public class OracleCartaoDAO {
	

    Connection connection = null;
    

	public Cartao SelectCartao(int cdCartao){
		
		
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Cartao cartao = new Cartao();
		Cliente cliente= new Cliente();
		try {
			connection =  EstatisticaDBManager.obterConexao();
			
			String sql = "SELECT cdCliente,  tipo FROM TB_CLIENTE WHERE cdCartao = ?";
			
			stmt = connection.prepareStatement(sql);
			
			stmt.setInt(1, cdCartao);
			
			rs = stmt.executeQuery();
			
			if(rs.next()) {
				cartao.setCdCartao(cdCartao);
				cliente.setCdCliente(rs.getInt("cdCliente"));
				cartao.setCliente(cliente);
				cartao.setTipo(rs.getInt("tipo"));
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
		
		
		
		
		return cartao;
	}


	
	
	
}
