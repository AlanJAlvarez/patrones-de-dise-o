import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class FlyLikeRocketTest {

    private FlyLikeRocket f;
    private ByteArrayOutputStream out;

    @Before
    public void setUp() throws Exception {
        f = new FlyLikeRocket();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void testFly() {
        f.fly();
        assertTrue(out.toString().toLowerCase().contains("estoy volando en un cohete"));
    }

    @Test
    public void testToString() {
        String esperado = "flylikerocket{}";
        String obtenido = f.toString().toLowerCase();
        assertEquals(esperado, obtenido);
    }
}