package entities;

import java.util.Scanner;

public class Conta {

	Scanner sc = new Scanner(System.in);

	private Integer numConta;
	private String titularConta;
	private Double saldoConta;

	public Conta() {
	}

	public Conta(Integer numConta, String titularConta, Double saldoConta) {
		this.numConta = numConta;
		this.titularConta = titularConta;
		this.saldoConta = saldoConta;
	}

	public String getTitularConta() {
		return titularConta;
	}

	public void setTitularConta(String titularConta) {
		this.titularConta = titularConta;
	}

	public Integer getNumConta() {
		return numConta;
	}

	public Double getSaldoConta() {
		return saldoConta;
	}

	public Double Saque(Double quantia) {
		return saldoConta -= quantia + 5;
	}

	public Double Deposito(Double quantia) {
		return saldoConta += quantia;
	}

	public Double SaldoInicial(char opcao) {
		if(opcao == 'y') {
			System.out.println("Valor inicial de depósito: ");
			Double quantia = 500.0;
			return saldoConta += quantia;
		}
		else {
			return saldoConta = 0.0;
		}
		
	}
	
	@Override
	public String toString() {
		return "Conta: " + numConta + " Titular da conta: " + titularConta + " Saldo na conta: " + saldoConta;
	}

}
