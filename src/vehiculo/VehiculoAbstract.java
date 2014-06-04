package vehiculo;

public abstract class VehiculoAbstract {
	private int precio;
	private String descripcion;

	public VehiculoAbstract(int precio, String descripcion) {
		this.precio = precio;
		this.descripcion = descripcion;
	}

	public abstract int PrecioFinal();

	public abstract String DescripcionFinal();

	public int getPrecio() {
		return precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

}
