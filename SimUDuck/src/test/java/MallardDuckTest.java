import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class MallardDuckTest {

    private MallardDuck d;
    private ByteArrayOutputStream out;

    @Before
    public void setUp() throws Exception {
        d = new MallardDuck();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void testDisplay(){
        d.display();
        assertTrue(out.toString().toLowerCase().contains("hola soy un pato silvestre"));
    }

    @Test
    public void testFlyWithWings(){
        d.performFly();
        assertTrue(out.toString().toLowerCase().contains("el pato esta volando"));
    }

    @Test
    public void testSoundQuack(){
        d.performSound();
        assertTrue(out.toString().toLowerCase().contains("el pato hace quack"));
    }

    @Test
    public void testSwim(){
        d.swim();
        assertTrue(out.toString().toLowerCase().contains("el pato esta nadando"));
    }

    @Test
    public void testToString() {
        String esperado = "mallardduck{}";
        String recibido = d.toString().toLowerCase();
        assertEquals(esperado, recibido);
    }
}