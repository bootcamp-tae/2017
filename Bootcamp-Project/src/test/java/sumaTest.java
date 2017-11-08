import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class sumaTest {


    @Test
    public void sumaPositivos() {
        System.out.println("Sumando dos números positivos ...");
        Suma s = new Suma(2,3);
        assertTrue(s.sumar() == 5);
    }

    @Test
    public void sumaNegativos() {
        System.out.println("Sumando dos números negativos ...");
        Suma S = new Suma(-2, -3);
        assertTrue(S.sumar() == -5);
    }

    @Test
    public void sumaPositivoNegativo() {
        System.out.println("Sumando un número positivo y un número negativo ...");
        Suma S = new Suma(2, -3);
        assertTrue(S.sumar() == -1);
    }
}
