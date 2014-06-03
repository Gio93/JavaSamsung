package abstractas;

public class Cuadrado extends Figura {
	private double lado;
	
	public Cuadrado(String descripcion, double lado){
		super(descripcion);
		this.setLado(lado);
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double area() {
		return this.lado*this.lado;
	}

	@Override
	public int numLados() {
		return 4;
	}

	@Override
	public String toString() {
		return "Cuadrado [lado=" + lado + "]";
	}

}
