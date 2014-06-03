package alquileVehiculos;

public abstract class Vehiculo {

	private final String idVehiculo;
	private String descripcion;
	
	public Vehiculo(String idVehiculo, String descripcion){
		this.idVehiculo = idVehiculo;
		this.setDescripcion(descripcion);
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getIdVehiculo() {
		return idVehiculo;
	}
	
	public abstract double getPrecio(int diasAlquiler);

	@Override
	public String toString() {
		return "Vehiculo [idVehiculo=" + idVehiculo + ", descripcion="
				+ descripcion + "]";
	}
	
	
}
