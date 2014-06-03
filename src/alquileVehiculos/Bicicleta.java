package alquileVehiculos;

public class Bicicleta extends Vehiculo {
	
	public Bicicleta(String idvehiculo,String descripcion){
		super(idvehiculo, descripcion);
	}

	@Override
	public double getPrecio(int diasAlquiler) {
		double precio=0;
		if(diasAlquiler<3){
			precio=diasAlquiler*3;
		}else if(diasAlquiler>2){
			precio=diasAlquiler*2;
		}else{
			precio=0;
		}
		return precio;
	}
}
