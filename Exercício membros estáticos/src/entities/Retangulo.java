package entities;

public class Retangulo {
	
	private Double altura;
	private Double largura;
	
	public Retangulo() {
	}
	
	public Retangulo(Double altura, Double largura) {
		this.altura = altura;
		this.largura = largura;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double getLargura() {
		return largura;
	}

	public void setLargura(Double largura) {
		this.largura = largura;
	}
	
	public Double Area(Double altura, Double largura) {
		return altura*largura;
	}
	
	public Double Perimetro(Double altura, Double largura) {
		return altura*2 + largura*2;
	}
	
	public Double Diagonal(Double altura, Double largura) {
		return Math.sqrt(altura*altura + largura*largura);
	}

}
