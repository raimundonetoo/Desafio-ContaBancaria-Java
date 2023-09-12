package ContaTerminal;

import java.util.Scanner;

public class EntradaUsuario {
	public static void main(String[] args) {
		ContaTerminal contaTerminal = new ContaTerminal();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o seu nome \n");
		contaTerminal.nomeCliente = scanner.next();
		System.out.print("Digite sua agencia \n");
		contaTerminal.agencia = scanner.next();
		System.out.print("Digite o número da sua conta");
		contaTerminal.numeroConta = scanner.next();
		System.out.print("Digite seu saldo inicial \n");
		contaTerminal.saldo = scanner.nextDouble();
		
		System.out.println("Olá " +contaTerminal.nomeCliente + " \n,obrigado por criar uma conta em nosso banco, sua agência é "+contaTerminal.agencia+ "\n,conta" +contaTerminal.numeroConta+"\n e seu saldo R$" +contaTerminal.saldo+ "\n já está disponível para saque");
		
		scanner.close();
	
	
	}

}
