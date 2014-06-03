package interfaces;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class NoticieroTest {
    ArrayList<Receptor> receptores= new ArrayList<Receptor>();
    
	@Test
	public void testInformar() {
		Noticiero noticiero = new Noticiero(receptores);
		ReceptorMock r = new ReceptorMock();
		noticiero.registrar(r);
		noticiero.informar("Noticia de ultima hora...");
		assertEquals(r.getNoticia(), "Noticia de ultima hora...");
	}

}
