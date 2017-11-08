import org.junit.Test;

public class MySuit {

    /*
    Se encargan de ejecutar codigo para todos los test indicando si va antes o despues:
    @Before  || @After
    */
    @Before
    public void setUp(){
        System.out.println("I'm running before every test");
    }

    @After
    public void tearDown(){
        _System.out.println("I'm running after every test");
    }

    /*
    Before class se encarga de ejecutar codigo antes de que se cree la clase. Por lo tanto también deben ser definidos
    cómo estáticos. Sólo se ejecutará una vez por más hilos que haya.
    @BeforeClass
    public static void setUpFirst(){
        System.out.println("I'm running Before the class! WOOH!");
     }
     */


    @Test
    public void test1(){
    /*
    ASSERTION : framework que ayuda a hacer validaciones y tira excepciones si no se corresponde con la validacion
    ASSUME : si la asuncion no se cumple, en vez de tirar una excepcion continua el programa.

        assumeThat():
        assertThat(): Permiten explayarme más en lo que quiero testear y que tanta información recibo si algo falla.
            Me permite dar un mensaje, un valor esperado y el valor actual. Pero soportan además del mensaje,
            MATCHERS: metodos que permiten ser más verborrágicos, (como pequeñas condiciones) ej: ( 3, is(not(2)) );


    */
    }
}
