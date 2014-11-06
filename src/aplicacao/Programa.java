package aplicacao;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Interface.Saudacao();
		Scanner scanner = new Scanner(System.in);
		
		if(Interface.LoginCliente(scanner) == -1) { //erro no acesso
			System.exit(0);
		}
		
		int opcao = -1;
		do {
			Interface.ImprimirMenu();
			opcao = scanner.nextInt();
			
			switch (opcao) {
			case 1:
				System.out.println("---saldo selecionado---");
				
				ProcessaSaldo();
				
				break;
			case 2:
				System.out.println("---saque selecionado---");
				break;
			case 0:
			default:
				break;
			}
		} while (opcao != 0);
		scanner.close();
	}

	private static void ProcessaSaldo() {
		//
		
	}

	
	
}
