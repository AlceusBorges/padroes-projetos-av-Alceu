public class FabricaBrasil implements FabricaAssinatura {
    public ComprovanteFiscal criarComprovante() { return new Nfse(); }
    public Pagamento criarPagamento() { return new Pix(); }
    public TermoPrivacidade criarTermo() { return new Lgpd(); }
}
