package interfaces;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReceptorMockTest {

	@Test
	public void testNoticia() {
		ReceptorMock receptormock = new ReceptorMock();
		receptormock.noticia("123");
		assertEquals(receptormock.getNoticia(), "123");
	}

}
