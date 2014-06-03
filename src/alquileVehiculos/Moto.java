package alquileVehiculos;

public class Moto extends Vehiculo {

	public Moto(String idVehiculo, String descripcion){
		super(idVehiculo,descripcion);
	}

	@Override
	public double getPrecio(int diasAlquiler) {
		double precio=0;
		if(diasAlquiler<7){
			precio = diasAlquiler*8;
		}else if(diasAlquiler>6){
			precio = diasAlquiler*7;
		}else{
			precio=0;
		}	
		return precio;
	}
	
}
