package entities;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	
	private List<Item> item = new ArrayList<>();
	private Integer numPed;
	private Cliente cliente;
	
	public Pedido() {
		
	}

	public Pedido(List<Item> item, Integer numPed) {
		this.item = item;
		this.numPed = numPed;
	}

	public List<Item> getItem() {
		return item;
	}

	public void setItem(List<Item> item) {
		this.item = item;
	}

	public Integer getNumPed() {
		return numPed;
	}

	public void setNumPed(Integer numPed) {
		this.numPed = numPed;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void addItem(Item item) {
		this.item.add(item);
	}
	
	public void removeItem(Item item) {
		this.item.remove(item);
	}

	@Override
	public String toString() {
		return cliente + " " + "NumPed: " + numPed + " " + item.toString();
	}
	
}