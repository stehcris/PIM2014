package aplicacao;

import java.util.Scanner;

import BancoDados.DAO.AcessoORACLE.OracleCaixaEletronicoDAO;
import BancoDados.DAO.AcessoORACLE.OracleClienteDAO;
import Entidades.CaixaEletronico;
import Entidades.Cliente;

public class Interface {

	/**
	 * Inicia a configuração de caixa eletrônico
	 * @return código do caixa eletronico
	 * */
	public static int Configuracao() {
		System.out.println("/*********************************\\");
		System.out.println("Banco BANATEM");
		System.out.println("Configurando caixa eletronico");
		
		OracleCaixaEletronicoDAO caixaDAO = new OracleCaixaEletronicoDAO();
		CaixaEletronico caixa = caixaDAO.SelectCaixaEletronico(1); //altere aqui para mudar o caixa
		System.out.println("Caixa eletronico selecionado: " + caixa.getEndenrecoBdn());
		System.out.println("\\*********************************/");
		
		return caixa.getCdBdn();
	}
	
	/**
	 * Exibe mensagem de saudação ao cliente. Utilizar após configuração
	 * */
	public static void Saudacao() {
		System.out.println("/*********************************\\");
		System.out.println("Bem vindo ao Banco BANATEM");
		System.out.println("\\*********************************/");
	}
	
	/**
	 * Captura informações do cliente
	 * Utiliza código e senha
	 * @return código do cliente 
	 * */
	public static int LoginCliente(Scanner entrada) {
		System.out.println("Informe sua AGENCIA e tecle <ENTER>:");
		String agencia = entrada.nextLine();
		
		System.out.println("Informe sua CONTA e tecle <ENTER>:");
		String conta = entrada.nextLine();
		
		System.out.println("Informe sua SENHA e tecle <ENTER>:");
		String senha = entrada.nextLine();
		
		OracleClienteDAO clienteDAO = new OracleClienteDAO();
		Cliente cliente = clienteDAO.AcessoCliente(agencia, conta, senha);
		
		if (cliente != null){
			return cliente.getCdCliente();
		} else {
			System.out.println("Senha Incorreta. Digite 1 para tentar novamente: ");
			if(entrada.nextLine().equals("1")) {
				return LoginCliente(entrada);
			}
		}
		return -1; //cliente não encontrado
	}
	
	/**
	 * Imprime menu de opções disponíveis ao cliente
	 * */
	public static void ImprimirMenu() {
		System.out.println("Escolha uma das opções abaixo:");
		System.out.println("1- Saldo");
		System.out.println("2- Saque");
		System.out.println("3- Transferencia");
		System.out.println("4- Alterar Senha");
		System.out.println("0- Sair");
		//... adicionar outras opções de menu aqui
	}
}
