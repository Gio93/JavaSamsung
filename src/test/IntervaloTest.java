package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class IntervaloTest {

	private int[] minimos = {0,-4,8,2,2};
	private int[] maximos = {0,8,4,4,8};
	private int[]maximosFinals = {0,8,8,4,8};
	private int[] minimos2 = {2,8,8,1,4};
	private int[] maximos2 = {2,10,8,5,6};
	private boolean[] solapado = {false,true,true,true,true};
	private boolean[] incluido = {false,true,true,false,true};
	
	@Test
	public void testIntervaloIntInt() {
		for(int i=0;i<minimos.length;i++){
			Intervalo intervalo = new Intervalo(minimos[i],maximos[i]);
			assertEquals(intervalo.getMinimo(), minimos[i] );
			assertEquals(intervalo.getMaximo(), maximosFinals[i]);
		}
	}

	@Test
	public void testIntervalo() {
		Intervalo intervalo = new Intervalo();
		assertEquals(intervalo.getMaximo(), 0);
		assertEquals(intervalo.getMinimo(), 0);
	}

	@Test
	public void testSolapado() {
		for(int i=0;i<minimos.length;i++){
			Intervalo intervalo = new Intervalo(minimos[i],maximosFinals[i]);
			assertEquals(intervalo.solapado(new Intervalo(minimos2[i], maximos2[i])), solapado[i]);
		}
	}

	@Test
	public void testIncluido() {
		for(int i=0;i<maximos.length;i++){
			Intervalo intervalo = new Intervalo(minimos[i],maximosFinals[i]);
			assertEquals(intervalo.incluido(new Intervalo(minimos2[i], maximos2[i])), incluido[i]);
		}
	}

}
