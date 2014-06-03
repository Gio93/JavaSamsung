package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnguloTest {
	private int[] gradoIni = { 0, -10, 10, 370, 730, -370 };
	private int[] gradosFinal = { 0, 350, 10, 10,10, 350 };
	private int[] sumando = { 10, 10, -20, +730, -730 };
	private int[] suma = { 10, 0, 350, 20, 0 };

	@Test
	public void testAnguloInt() {
		for (int i = 0; i < gradoIni.length; i++) {
			Angulo angulo = new Angulo(gradoIni[i]);
			assertEquals(angulo.getGrado(), gradosFinal[i]);
		}
	}

	@Test
	public void testAngulo() {
		Angulo angulo = new Angulo();
		assertEquals(angulo.getGrado(), 0);
	}

	@Test
	public void testSuma() {
		for (int i = 0; i < suma.length; i++) {
			Angulo angulo = new Angulo(gradosFinal[i]);
			assertEquals(angulo.suma(sumando[i]), suma[i]);
		}
	}

}
