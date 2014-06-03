package herencia2;

import static org.junit.Assert.*;

import org.junit.Test;

public class AdministradorTest {

	@Test
	public void testSalario() {
		Administrador admin = new Administrador("52904001E",200);
		assertEquals(admin.salario(), 2000,10e-9);
	}

	@Test
	public void testAdministradorStringInt() {
		Administrador admin = new Administrador("52904001E",10);
		assertEquals(admin.getDni(),"52904001E");
		assertEquals(admin.getHoras(), 10);
	}

}
