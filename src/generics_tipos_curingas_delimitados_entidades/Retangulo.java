package generics_tipos_curingas_delimitados_entidades;

public class Retangulo implements Figura{

	private double largura;
	private double altura;
	
	public Retangulo(double largura, double altura) {
		this.largura = largura;
		this.altura  = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}	
	
	@Override
	public double area() {
		return largura * altura;
	}
}
