package alquileVehiculos;

import static org.junit.Assert.*;

import org.junit.Test;

public class BicicletaTest {

	@Test
	public void testGetPrecio() {
		Vehiculo c = new Bicicleta("000111","Soy una bibicleta");
		assertEquals(c.getPrecio(10), 20,10e-9);
	}

}
