package generics_tipos_curingas_delimitados_main;

import java.util.ArrayList;
import java.util.List;

import generics_tipos_curingas_delimitados_entidades.Circulo;
import generics_tipos_curingas_delimitados_entidades.Figura;
import generics_tipos_curingas_delimitados_entidades.Retangulo;

public class Programa {
	/*
	 * Vamos fazer um método para retornar a soma das áreas de uma lista de
	 * figuras.
	 */
	public static void main(String[] args) {
		
		List<Figura> minhasFiguras = new ArrayList<>();
		minhasFiguras.add(new Retangulo(3.0,2.0));
		minhasFiguras.add(new Circulo(2.0));
		
		List<Circulo> meusCirculos = new ArrayList<>();
		meusCirculos.add(new Circulo(3.0));
		meusCirculos.add(new Circulo(2.0));
		
		System.out.println("Area total: " + areaTotal(meusCirculos));
	}
	
	public static double areaTotal(List<? extends Figura> lista) {
		double soma = 0.0;
		for(Figura figura : lista) {
			soma += figura.area();
		}
		return soma;
	}

}
