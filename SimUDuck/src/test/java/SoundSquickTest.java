import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class SoundSquickTest {

    public SoundSquick s;
    public ByteArrayOutputStream out;

    @Before
    public void setUp() throws Exception {
        s = new SoundSquick();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void testQuack() {
        s.makeSound();
        assertTrue(out.toString().toLowerCase().contains("el pato hace squick"));
    }

    @Test
    public void testToString() {
        String esperado = "soundsquick{}";
        String obtenido = s.toString().toLowerCase();
        assertEquals(esperado, obtenido);
    }
}