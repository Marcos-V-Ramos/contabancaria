package conta;

import java.util.Scanner;

import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {
		final Scanner entrada = new Scanner(System.in);

		int opcao, numero, agencia, tipo, aniversario, numeroDestino;
		String titular;
		float saldo, limite, valor;

		System.out.println("***********************************\n\n");
		System.out.println("       BANCO DO BRAZIL COM Z       \n\n");
		System.out.println("***********************************\n");
		System.out.println("1 - Criar Conta");
		System.out.println("2 - Listar Todas as Contas");
		System.out.println("3 - Buscar Conta por Número");
		System.out.println("4 - Atualizar Dados da Conta");
		System.out.println("5 - Apagar Conta");
		System.out.println("6 - Sacar");
		System.out.println("7 - Depositar");
		System.out.println("8 -Transferir valores entre Contas");
		System.out.println("9 - Sair\n");
		System.out.println("***********************************\n");

		
		while (true) {
			System.out.println("Entre com a opção desejada:\n");

			opcao = entrada.nextInt();

			if (opcao == 9) {
				System.out.println("Banco do Brazil com Z - O seu Futuro começa aqui!\n");
				entrada.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("Criar Conta\n\n");
				break;
			case 2:
				System.out.println("Listar todas as Contas\n\n");
				break;
			case 3:
				System.out.println("Consultar dados da Conta - por número\n\n");
				break;
			case 4:
				System.out.println("Atualizar dados da Conta\n\n");
				break;
			case 5:
				System.out.println("Apagar a Conta\n\n");
				break;
			case 6:
				System.out.println("Saque\n\n");
				break;
			case 7:
				System.out.println("Depósito\n\n");
				break;
			case 8:
				System.out.println("Transferência entre Contas\n\n");
				break;
			default:
				System.out.println("\nOpção Inválida!\n");
				break;
			}
			
		}
	}

}