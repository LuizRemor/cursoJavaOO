package entities;

public class Cliente {
	
	private String nome;
	private Integer codigo;
	
	public Cliente() {
		
	}
	
	public Cliente(String nome, Integer codigo) {
		this.nome = nome;
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return nome + " - Codigo " + codigo;
	}
	
	

}