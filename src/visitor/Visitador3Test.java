package visitor;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

public class Visitador3Test {

	private Collection<Elemento> coleccion = new ArrayList<Elemento>();

    @Before
    public void ini() {
        coleccion.add(new ElementoA());
        coleccion.add(new ElementoA());
        coleccion.add(new ElementoB());
        coleccion.add(new ElementoA());
        coleccion.add(new ElementoB());
    }
    
	@Test
	public void testconsecutivos() {
		Visitador3 v3 = new Visitador3();
		for(Elemento elem : coleccion){
			elem.aceptar(v3);
		}
		assertEquals(2, v3.mayorA);
		assertEquals(1, v3.mayorB);
	}

}
