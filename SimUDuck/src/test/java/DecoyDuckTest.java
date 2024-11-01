import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class DecoyDuckTest {

    private DecoyDuck d;
    private ByteArrayOutputStream out;

    @Before
    public void setUp() throws Exception {
        d = new DecoyDuck();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void display() {
        d.display();
        assertTrue(out.toString().toLowerCase().contains("hola soy un pato señuelo"));
    }

    @Test
    public void testSwim(){
        d.swim();
        assertTrue(out.toString().toLowerCase().contains("el pato esta nadando"));
    }

    @Test
    public void testFlyNoWay(){
        d.performFly();
        assertTrue(out.toString().toLowerCase().contains("el pato no puede volar"));
    }

    @Test
    public void testMuteSound(){
        d.performSound();
        assertTrue(out.toString().toLowerCase().contains("el pato no hace sonido"));
    }

    @Test
    public void testToString() {
        String esperado = "decoyduck{}";
        String obtenido = d.toString().toLowerCase();
        assertEquals(esperado, obtenido);
    }
}