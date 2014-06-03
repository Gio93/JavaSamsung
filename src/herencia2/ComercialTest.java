package herencia2;

import static org.junit.Assert.*;

import org.junit.Test;

public class ComercialTest {

	@Test
	public void testSalario() {
		Comercial comercial = new Comercial("52904002E",100,2);
		assertEquals(comercial.salario(), 802,10e-9);
	}

	@Test
	public void testComercial() {
		Comercial comercial = new Comercial("52904002E",100,2);
		assertEquals(comercial.getDni(), "52904002E");
		assertEquals(comercial.getHoras(), 100);
		assertEquals(comercial.getComision(), 2,10e-9);
	}

}
