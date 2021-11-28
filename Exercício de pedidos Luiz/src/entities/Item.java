package entities;

public class Item {

	private String nome;
	private Integer qtd;
	private Double preco;

	public Item() {
	}

	public Item(Integer qtd, Double preco, String nome) {
		this.qtd = qtd;
		this.preco = preco;
		this.nome = nome;
	}

	public Integer getQtd() {
		return qtd;
	}

	public void setQtd(Integer qtd) {
		this.qtd = qtd;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double SubTotal() {
		return preco*qtd;
	}

	@Override
	public String toString() {
		return nome + ", R$" + preco + ", " + qtd + " Sub total: R$" + SubTotal();
	}
		
}
