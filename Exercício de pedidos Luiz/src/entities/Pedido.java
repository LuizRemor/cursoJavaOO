package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.Status;

public class Pedido {
	
	private Date data = new Date();
	private Status status;
	List<Item> list = new ArrayList<>();
	
	public Pedido() {
	}
	
	public Pedido(Date data, Status status) {
		this.data = data;
		this.status = status;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
	public void AdicionaItem(Item qtd) {
		list.add(qtd);
	}
	
	public void RemoveItem(Item qtd) {
		list.remove(qtd);
	}
	
	public Double Total() {
		double soma = 0.0;
		
		for(Item item : list) {
			soma += item.SubTotal();
		}
		return soma;
	}
	
}