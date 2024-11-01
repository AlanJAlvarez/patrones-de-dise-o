import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class MuteSoundTest {

    public MuteSound s;
    public ByteArrayOutputStream out;

    @Before
    public void setUp() throws Exception {
        s = new MuteSound();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void testQuack() {
        s.makeSound();
        assertTrue(out.toString().toLowerCase().contains("el pato no hace sonido"));
    }

    @Test
    public void testToString() {
        String esperado = "soundnoway{}";
        String obtenido = s.toString().toLowerCase();
        assertEquals(esperado, obtenido);
    }
}
