import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class RubberDuckTest {

    public RubberDuck d;
    public ByteArrayOutputStream out;

    @Before
    public void setUp() throws Exception {
        d = new RubberDuck();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void testDisplay() {
        d.display();
        assertTrue(out.toString().toLowerCase().contains("hola soy un pato de hule"));
    }

    @Test
    public void testSwim() {
        d.swim();
        assertTrue(out.toString().toLowerCase().contains("el pato esta nadando"));
    }

    @Test
    public void testFlyNoWay(){
        d.performFly();
        assertTrue(out.toString().toLowerCase().contains("el pato no puede volar"));
    }

    @Test
    public void testSoundSquick(){
        d.performSound();
        assertTrue(out.toString().toLowerCase().contains("el pato hace squick"));
    }

    @Test
    public void testToString() {
        String esperado = "rubberduck{}";
        String obtenido = d.toString().toLowerCase();
        assertEquals(esperado, obtenido);
    }
}