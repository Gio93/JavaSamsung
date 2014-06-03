package alquileVehiculos;

import static org.junit.Assert.*;

import org.junit.Test;

public class MotoTest {

	@Test
	public void testGetPrecio() {
		Vehiculo b = new Moto("00011", "Soy una moto Yamaha");
		assertEquals(b.getPrecio(4),32,10e-9);
	}

}
