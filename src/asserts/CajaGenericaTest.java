package asserts;

import static org.junit.Assert.*;

import org.junit.Test;

public class CajaGenericaTest {

	@Test
	public void testAlmacenarExtraer() {
		CajaGenerica<String> caja = new CajaGenerica<String>();
		try{
			//caja.almacenar(null);//assert provoca error
			//caja.almacenar("obj1");
			//caja.almacenar("obj2");//RuntimeException provoca error;
			caja.extraer();
			//assertEquals(caja.extraer(), "obj1");//RuntimeException provoca error
			fail("No puede llegar aqui");
		}catch(RuntimeException e){}
	}

}
