import static org.junit.jupiter.api.Assertions.*;

class CreadorTest {

    @org.junit.jupiter.api.Test
    void crearClave(){
        Creador creadorDePruebas=new Creador();
        String dato=creadorDePruebas.crearClave(5);
        assertEquals(dato.length(), 5);
    }
}