import org.junit.Test;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MicroorganismoTest {
    private int vidaMax = 500;
    private Microorganismo micro = new Microorganismo("MicroPrueba",vidaMax);

    @Test
    public void TestIrOrgano(){
        int vida = micro.getVidas();
        assertFalse(micro.getVidas()<vida);
    }

    @ParameterizedTest
    @ValueSource(strings = {"boca","cerebro","estomago"})

    void TestIrLugares(String lugares){
        micro.setVidas(1);
        micro.IrLugar(lugares);
        assertEquals(0 ,micro.validaVidas());
    }

    @RepeatedTest(10)
    void TestBajarVida(){
        micro.IrLugar("higado");
        assertTrue(micro.validaVidas() == 0);
    }
}