package abstractas;

public class Triangulo extends Figura {
	private double base;
	private double altura;

	public Triangulo(String descripcion, double base, double altura) {
		super(descripcion);
		this.setBase(base);
		this.setAltura(altura);
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double area() {
		return (this.base * this.altura) / 2;
	}

	@Override
	public int numLados() {
		return 3;
	}

	@Override
	public String toString() {
		return "Triangulo [base=" + base + ", altura=" + altura + "]";
	}

}
