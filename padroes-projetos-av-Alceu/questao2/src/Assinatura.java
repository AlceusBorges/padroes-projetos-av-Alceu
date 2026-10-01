public class Assinatura {
    private final ComprovanteFiscal comprovante;
    private final Pagamento pagamento;
    private final TermoPrivacidade termo;

    public Assinatura(FabricaAssinatura fabrica) {
        comprovante = fabrica.criarComprovante();
        pagamento = fabrica.criarPagamento();
        termo = fabrica.criarTermo();
    }

    public void ativar() {
        System.out.println("Comprovante: " + comprovante.descricao());
        System.out.println("Pagamento: " + pagamento.descricao());
        System.out.println("Privacidade: " + termo.descricao());
        System.out.println();
    }
}
