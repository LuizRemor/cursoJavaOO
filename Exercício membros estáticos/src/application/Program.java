package application;

import entities.Retangulo;

public class Program {

	public static void main(String[] args) {
		
		Double altura = 3.0;
		Double largura = 4.0;
		
		Retangulo ret = new Retangulo(altura, largura);
		
		System.out.printf("Medidas do triângulo: %.2f x %.2f", altura, largura);
		System.out.println();
		
		System.out.println("Área: " + ret.Area(altura, largura));
		System.out.println("Perímetro: " + ret.Perimetro(altura, largura));
		System.out.println("Diagonal: " + ret.Diagonal(altura, largura));

	}

}
