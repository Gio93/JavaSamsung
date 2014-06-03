package test;

public class Rectangulo {
	private int base;
	private int altura;


	public Rectangulo(int base, int altura) {
		this.setBase(base);
		this.setAltura(altura);
	}

	public Rectangulo() {
		this(0, 0);
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base=positivo(base);
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura=positivo(altura);
	}

	public double area() {
		return this.base *this.altura;
	}

	public double perimetro() {
		return (2 * (this.base +this.altura));
	}
	
	private int positivo(int valor){
		if(valor<0){
			return 0;
		}
		else{
			return valor;
		}
	}

	
}
