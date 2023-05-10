import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComprobadorTest {
    @Test
    void Comprueba(){
        Comprobador comprobador = new Comprobador();
        boolean resultado = comprobador.Comprueba("MUNDO", 5);
        assertTrue(resultado, "El resultado no puede ser negativo");
        boolean resultado2 = comprobador.Comprueba("MUNDo", 5);
        assertFalse(resultado2, "El resultado tiene una minuscula");
        boolean resultado3 = comprobador.Comprueba("MUNDO", 6);
        assertFalse(resultado3, "La palabra es de mayor longitud a lo permitido");
        boolean resultado4 = comprobador.Comprueba("MUNDO", 4);
        assertFalse(resultado4, "La palabra es de menor longitud a lo permitido");
    }
}