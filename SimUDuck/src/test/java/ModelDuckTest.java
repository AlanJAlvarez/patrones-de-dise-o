import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class ModelDuckTest {

    private ModelDuck d;
    private ByteArrayOutputStream out;

    @Before
    public void setUp() throws Exception {
        d = new ModelDuck();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void testDisplay() {
        d.display();
        assertTrue(out.toString().toLowerCase().contains("soy un pato modelo"));
    }

    @Test
    public void testSwim(){
        d.swim();
        assertTrue(out.toString().toLowerCase().contains("el pato esta nadando"));
    }

    @Test
    public void testCambiarMecanismoVoladorEnTiempoDeEjecucion(){
        d.performFly();
        assertTrue(out.toString().toLowerCase().contains("el pato no puede volar"));
        d.setFb(new FlyLikeRocket());
        d.performFly();
        assertTrue(out.toString().toLowerCase().contains("estoy volando en un cohete"));
    }

    @Test
    public void testMuteSound(){
        d.performSound();
        assertTrue(out.toString().toLowerCase().contains("el pato no hace sonido"));
    }

    @Test
    public void testToString() {
        String esperado = "modelduck{}";
        String obtenido = d.toString().toLowerCase();
        assertEquals(esperado, obtenido);
    }
}