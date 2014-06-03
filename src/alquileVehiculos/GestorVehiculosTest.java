package alquileVehiculos;

import static org.junit.Assert.*;

import org.junit.Test;

public class GestorVehiculosTest {
	
	
	@Test
	public void testDarAltaVehiculo() {
		Vehiculo a = new Coche("00001", "soy un coche Mercedes",Categoria.C);
		GestorVehiculos gestor = new GestorVehiculos();
		gestor.DarAltaVehiculo(a);
		assertEquals(gestor.getVehiculo("00001"), a);
	}


	@Test
	public void testGetVehiculo() {
		Vehiculo a = new Coche("00001", "soy un coche Mercedes",Categoria.C);
		GestorVehiculos gestor = new GestorVehiculos();
		gestor.DarAltaVehiculo(a);
		gestor.getVehiculo(a.getIdVehiculo());
	}

}
