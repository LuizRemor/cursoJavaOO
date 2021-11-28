package application;

import entities.Cliente;
import entities.Item;
import entities.Pedido;

public class Program {

	public static void main(String[] args) {
		
		Pedido pedido = new Pedido();
		pedido.setCliente(new Cliente("Luiz", 100));

		System.out.println("Dados do cliente:");
		System.out.println(pedido.getCliente());
		pedido.setNumPed(100);

		System.out.println("Produtos adicionados:");
		for(int i=1; i<=3; i++) {
		pedido.addItem(new Item("TV", i, 1000.0));
		}

		System.out.println(pedido.toString());

	}

}