package clases;

public class Rectangulo {
	private int base;
	private int altura;

	public Rectangulo(int d, int e) {
		this.setBase(d);
		this.setAltura(e);
	}

	public Rectangulo() {
		this(0, 0);
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public double area() {
		return (Math.abs(this.base * this.altura));
	}

	public double perimetro() {

		return (2 * (positivo(this.base) + positivo(this.altura)));
	}

	private double positivo(double valor) {
		if (valor < 0) {
			return 0;
		} else
			return valor;
	}

}
