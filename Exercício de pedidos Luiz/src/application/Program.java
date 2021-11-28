package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.Cliente;
import entities.Item;
import entities.Pedido;
import entities.enums.Status;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Item> lista = new ArrayList<>();
		Pedido ped = new Pedido();
		
		String nome = "Alex";
		String email = "alex@gmail.com.br";
		Date dataNascimento = sdf.parse("15/03/1985");
		
		Cliente cliente = new Cliente(nome, email, dataNascimento);
		
		System.out.print("Dados do cliente:");
		System.out.println();
		System.out.print(cliente.toString());
		System.out.println();
		
		System.out.println("Status:");
		System.out.println(Status.PROCESSANDO);
		Integer n = 2;
		System.out.println();
		
		for(int i=1; i<=n; i++) {
			ped.AdicionaItem(new Item(i, 1000.0, "TV"));
			Item item = new Item(i, 1000.0, "TV");
			lista.add(item);
		}
		
		System.out.println("Resumo de pedido: ");
		
		for(Item resumo : lista) {
			System.out.println(resumo.toString());
		}
		
		//valor total tá certo
		System.out.printf("Valor total %.2f", ped.Total());
		
		sc.close();

	}

}