package AbstractESin;

public class Conta {
    private Cartao cartao;
    private Extrato extrato;

    public Conta(FabricaAbstrata fabrica) {
        this.cartao = fabrica.createCartao();
        this.extrato = fabrica.createExtrato();
    }

    public String emitirCartao() {
        return this.cartao.emitir();
    }

    public String emitirExtrato() {
        return this.extrato.emitir();
    }
}
