package AbstractESin;

public class FabricaCorrente implements FabricaAbstrata {

    private FabricaCorrente() {};
    private static FabricaCorrente instance = new FabricaCorrente();
    public static FabricaCorrente getInstance() {
        return instance;
    }


    @Override
    public Cartao createCartao() {
        return new CartaoCorrente();
    }

    @Override
    public Extrato createExtrato() {
        return new ExtratoCorrente();
    }
}
