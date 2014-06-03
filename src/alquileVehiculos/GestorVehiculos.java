package alquileVehiculos;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class GestorVehiculos {
	private final HashMap<String, Vehiculo> Stock = new HashMap<>();

	public HashMap<String, Vehiculo> getStock() {
		return Stock;
	}

	public void DarAltaVehiculo(Vehiculo vehiculo) {
		Stock.put(vehiculo.getIdVehiculo(), vehiculo);
	}

	public void verStock() {
		Collection<Vehiculo> coleccion= this.valores();
		Iterator<Vehiculo> iterador = coleccion.iterator();
		while(iterador.hasNext()){
			System.out.println(iterador.next());
		}
	}
	
	private Collection<Vehiculo> valores(){
		return Stock.values();
	}

	public Vehiculo getVehiculo(String idVehiculo) {
		return Stock.get(idVehiculo);
	}
}
