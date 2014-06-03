package factoryMethodNumero;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

import org.junit.Test;

public class NumeroTest {
    private CreadorNumero creadorDE = new CreadorNumeroDE();

    private CreadorNumero creadorEs = new CreadorNumeroES();

    @Test
    public void testIsNew() {
        Numero num = creadorDE.createNumero();
        assertNotSame(creadorDE.createNumero(), num);
    }

    @Test
    public void testConvertir() {
        assertEquals("0 a ES", "cero", this.creadorEs.createNumero().convertir(0).toLowerCase());
        assertEquals("5 a EN", "five", this.creadorDE.createNumero().convertir(5).toLowerCase());
    }

}