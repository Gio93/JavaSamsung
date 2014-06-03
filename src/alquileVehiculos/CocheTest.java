package alquileVehiculos;

import static org.junit.Assert.*;

import org.junit.Test;

public class CocheTest {

	@Test
	public void testGetPrecio() {
		Vehiculo a = new Coche("00001", "soy un coche Mercedes",Categoria.C);
		assertEquals(a.getPrecio(5),80,10e-9);
	}

	@Test
	public void testCoche() {
		Coche a = new Coche("00001", "soy un coche Mercedes",Categoria.B);
		assertEquals(a.getIdVehiculo(),"00001");
		assertEquals(a.getDescripcion(), "soy un coche Mercedes");
		assertEquals(a.getCategoria(), Categoria.B);
	}

}
