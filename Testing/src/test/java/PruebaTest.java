import junit.framework.TestCase;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PruebaTest extends TestCase {

    @Test
    public void testSuma(){
        assertEquals("Suma failed, result must be 5", 5, Prueba.suma(2,3));
    }
}
