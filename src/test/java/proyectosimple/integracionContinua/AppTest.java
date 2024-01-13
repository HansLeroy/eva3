package proyectosimple.integracionContinua;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testGetHelloWorld() {
        App app = new App();
        String result = app.getHelloWorld();
        assertEquals("Hello World!", result);
    }
}
