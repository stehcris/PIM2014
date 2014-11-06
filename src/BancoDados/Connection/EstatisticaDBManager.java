package BancoDados.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EstatisticaDBManager {

	/********************************
	 *                              *
	 * Conecao com o Banco de Dados *
	 *                              *
	 ********************************/

	public static Connection obterConexao() {
		Connection connection = null;

		//ORACLE
//		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.60.15:1521:MYSQL","OPS$RM66703","221192");
//			//		connection = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL","OPS$RM66703","221192");
//
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//
//		} catch(SQLException e) {
//			e.printStackTrace();
//		}

		//SQL SERVER
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=PIM2014;userName=appPim2014;password=pim2014");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}

}	
