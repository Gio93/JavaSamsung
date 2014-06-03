package herencia2;

import static org.junit.Assert.*;

import org.junit.Test;

public class NominaTest {

	Empleado[] empleados = {new Administrador("52904001E",200), new Comercial("52904002E",100,2)};
	@Test
	public void testTotalNominas() {
		Nomina nomina = new Nomina();
		assertEquals(nomina.totalNominas(empleados), 2802,10e-9);
	}

}
