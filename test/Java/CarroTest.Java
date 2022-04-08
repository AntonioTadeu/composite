package padroesestruturais.composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroTest {

    @Test
    void deveRetornarCarro() {
        Unidade unidade1 = new Unidade("Padrões de Carro");

        Unidade unidade2 = new Unidade("Padrões");
        Topico topico21 = new Topico("Padrão Composite", 2);
       

    @Test
    void deveRetornarExecacaoCarro() {
        try {
            Carro Carro = new Automovel();
            Carro.getMotor();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Carro não achado", e.getMessage());
        }
    }
}