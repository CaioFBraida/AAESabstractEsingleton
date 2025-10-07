package AbstractESin;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ContaTest {
    @Test
    void deveEmitirCartaoCorrente() {
        FabricaAbstrata fabrica = FabricaCorrente.getInstance();
        Conta conta = new Conta(fabrica);
        assertEquals("Cartão de Credito", conta.emitirCartao());
    }

    @Test
    void deveEmitirExtratoCorrente() {
        FabricaAbstrata fabrica = FabricaCorrente.getInstance();
        Conta conta = new Conta(fabrica);
        assertEquals("Extrato da conta corrente", conta.emitirExtrato());
    }

    @Test
    void deveEmitirCartaoPoupanca() {
        FabricaAbstrata fabrica = FabricaPoupanca.getInstance();
        Conta conta = new Conta(fabrica);
        assertEquals("Cartão de débito", conta.emitirCartao());
    }


    @Test
    void deveEmitirExtratoPoupanca() {
        FabricaAbstrata fabrica = FabricaPoupanca.getInstance();
        Conta conta = new Conta(fabrica);
        assertEquals("Extrato de débito", conta.emitirExtrato());
    }
}
