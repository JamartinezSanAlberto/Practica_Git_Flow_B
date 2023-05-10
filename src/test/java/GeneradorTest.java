import static org.junit.jupiter.api.Assertions.*;

class GeneradorTest {

    @org.junit.jupiter.api.Test
    void generar_pista() {
        Generador generador = new Generador();
        String comparacion1 = generador.generar_pista("DIEGO", "JUEGO");
        assertEquals("--OOO", comparacion1, "Resultado no esperado");

        String comparacion2 = generador.generar_pista("DIEGO", "MOVIL");
        assertEquals("-X-X-", comparacion2, "Resultado no esperado");

        String comparacion3 = generador.generar_pista("DIEGO", "TIRON");
        assertEquals("-O-X-", comparacion3, "Resultado no esperado");

        String comparacion4 = generador.generar_pista("DIEGO", "DIEGO");
        assertEquals("OOOOO", comparacion4, "Resultado no esperado");
    }
}