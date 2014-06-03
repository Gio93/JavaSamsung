package singleton;

import static org.junit.Assert.*;

import org.junit.Test;

public class LoggerTest {
    @Test
    public void testIsSingleton() {
        assertSame("No es la misma referencia", Logger.getLogger(), Logger.getLogger());
    }
    @Test
    public void testSingletonNotNull() {
        assertNotNull(Logger.getLogger());
    }

}
