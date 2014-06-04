package vehiculo;

public class Vehiculo extends VehiculoAbstract {
	private String modelo;

	public Vehiculo(int precio, String descripcion, String modelo) {
		super(precio, descripcion);
		this.modelo = modelo;
	}

	@Override
	public int PrecioFinal() {
		return this.getPrecio();
	}

	@Override
	public String DescripcionFinal() {
		return "Vehiculo: " + this.getDescripcion()+"\n" +" Modelo: " + this.modelo+"\n";
	}

}
