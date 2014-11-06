package BancoDados.DAO.AcessoORACLE;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import BancoDados.Connection.EstatisticaDBManager;
import Entidades.Cliente;

public class OracleClienteDAO {

	Connection connection = null;

	public void UdateCliente(Cliente  cliente) {
		try {
			String sql = null;

			connection = EstatisticaDBManager.obterConexao();

			sql = "UPDATE TB_CLIENTE SET  cdSenha  = ?, vlrCliente = ?, WHERE cdCliente  = ?";

			PreparedStatement colocar = connection.prepareStatement(sql);

			colocar.setString(1, cliente.getSenha());
			colocar.setDouble(2, cliente.getVlrCliente());
			colocar.setInt(3, cliente.getCdCliente()); 

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

	public Cliente SelectCliente(int cdCliente){
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Cliente cliente = new Cliente();

		try {
			connection =  EstatisticaDBManager.obterConexao();

			String sql = "SELECT cdCliente, vlrCliente, nmCliente FROM TB_CLIENTE WHERE cdCliente = ?";

			stmt = connection.prepareStatement(sql);

			stmt.setInt(1, cdCliente);

			rs = stmt.executeQuery();

			if(rs.next()) {
				cliente.setCdCliente(cdCliente);
				cliente.setVlrCliente(rs.getDouble("vlrCliente"));
				cliente.setNmCliente(rs.getString("nmCliente"));
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
		return cliente;
	}
	
	public Cliente AcessoCliente(String agencia, String conta, String senha){
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Cliente cliente = null;

		try {
			connection =  EstatisticaDBManager.obterConexao();

			String sql = "SELECT cdCliente, vlrCliente, nmCliente FROM TB_CLIENTE WHERE agencia = ?"+
					" and conta = ? and senha = ?";

			stmt = connection.prepareStatement(sql);

			stmt.setString(1, agencia);
			stmt.setString(2, conta);
			stmt.setString(3, senha);

			rs = stmt.executeQuery();

			if(rs.next()) {
				cliente = new Cliente();
				cliente.setCdCliente(rs.getInt("cdCliente"));
				cliente.setVlrCliente(rs.getDouble("vlrCliente"));
				cliente.setNmCliente(rs.getString("nmCliente"));
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
		return cliente;
	}
	
}
