package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class RectanguloTest {

	private int[] bases = { 1, 0, 0, -1, 1 };
	private int[] alturas = { 1, 1, 0, 1, -1 };
	private double[] areas = { 1, 0, 0, 0, 0 };
	private double[] perimetros = { 4, 2, 0, 2, 2 };

	@Test
	public void testRectanguloIntInt() {
		for(int i=0;i<bases.length;i++){
			Rectangulo rec = new Rectangulo(bases[i],alturas[i]);
			assertEquals(rec.getBase(), convertirInt(bases[i]));
			assertEquals(rec.getAltura(), convertirInt(alturas[i]));
		}
	}

	@Test
	public void testArea() {
		for(int i=0;i<areas.length;i++){
			Rectangulo rec = new Rectangulo(bases[i],alturas[i]);
			assertEquals(rec.area(), convertirDouble(areas[i]),10e-9);
		}
	}

	@Test
	public void testPerimetro() {
		for(int i=0;i<perimetros.length;i++){
			Rectangulo rec = new Rectangulo(bases[i],alturas[i]);
			assertEquals(rec.perimetro(), convertirDouble(perimetros[i]),10e-9);
		}
	}
	private int convertirInt(int valor){
		if(valor<0){
			return 0;
		}else{
			return valor;
		}
	}
	
	private double convertirDouble(double valor){
		if(valor<0){
			return 0;
		}else{
			return valor;
		}
	}

}
