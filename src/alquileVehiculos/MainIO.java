package alquileVehiculos;

import upm.jbb.IO;

public class MainIO {
	private GestorVehiculos gestor = new GestorVehiculos();
	
	public void DarAltaCoche(){
		Vehiculo coche = (Vehiculo) IO.in.read("alquileVehiculos.Coche", "Dar de AltaCoche");
		gestor.DarAltaVehiculo(coche);
	}
	
	public void DarAltaMoto(){
		Vehiculo moto = (Vehiculo) IO.in.read("alquileVehiculos.Moto", "Dar de AltaMoto");
		gestor.DarAltaVehiculo(moto);
	}
	public void DarAltaBici(){
		Vehiculo bicicleta = (Vehiculo) IO.in.read("alquileVehiculos.Bicicleta", "Dar de AltaBicicleta");
		gestor.DarAltaVehiculo(bicicleta);
	}
	
	public void verStock(){
		gestor.verStock();
	}
	
	public void DarPrecio(){
		Vehiculo vehiculo = (Vehiculo) IO.in.read("alquileVehiculos.Moto", "Precio");
		DiasAlquiler dias = (DiasAlquiler) IO.in.read("alquileVehiculos.DiasAlquiler", "Dias");
		System.out.println("El precio total es: "+gestor.getVehiculo(vehiculo.getIdVehiculo()).getPrecio(dias.getDias()));
	}
	public static void main(String[] args) {
		IO.in.addController(new MainIO());

	}

}
