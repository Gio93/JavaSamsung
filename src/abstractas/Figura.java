package abstractas;

public abstract class Figura {
	private String descripcion;

	public Figura(String descripcion) {
		this.setDescripcion(descripcion);
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public abstract double area();

	public abstract int numLados();

}
