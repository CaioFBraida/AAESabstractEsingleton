package AbstractESin;

public class FabricaPoupanca implements FabricaAbstrata {

    private FabricaPoupanca() {};
    private static FabricaPoupanca instance = new FabricaPoupanca();
    public static FabricaPoupanca getInstance() {
        return instance;
    }

    @Override
    public Cartao createCartao() {
        return null;
    }

    @Override
    public Extrato createExtrato() {
        return null;
    }
}
