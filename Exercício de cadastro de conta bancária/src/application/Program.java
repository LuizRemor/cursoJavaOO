package application;

import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Integer numConta = 8532;
		String titularConta = "Alex Green";
		
		Conta conta = new Conta(numConta, titularConta, 0.0);
		
		System.out.println("Terá saldo inicial? (y/n)");
		char opcao = sc.nextLine().charAt(0);
		
		conta.SaldoInicial(opcao);
		
		System.out.println(conta.toString());
		
		System.out.println("Valor a ser depositado: ");
		
		Double quantia = 200.0;
		
		conta.Deposito(quantia);
		
		System.out.println(conta.toString());
		
		System.out.println("Valor a ser sacado: ");
		
		quantia = 198.0;
		
		conta.Saque(quantia);
		
		System.out.println(conta.toString());
		
		sc.close();
	}

}
