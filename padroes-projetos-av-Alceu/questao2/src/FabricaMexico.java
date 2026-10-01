public class FabricaMexico implements FabricaAssinatura {
    public ComprovanteFiscal criarComprovante() { return new Cfdi(); }
    public Pagamento criarPagamento() { return new Spei(); }
    public TermoPrivacidade criarTermo() { return new Lfpdppp(); }
}
