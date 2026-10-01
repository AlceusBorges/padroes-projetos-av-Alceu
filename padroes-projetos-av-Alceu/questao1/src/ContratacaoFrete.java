public abstract class ContratacaoFrete {

    // Factory Method
    protected abstract Frete criarFrete();

    // Procedimento comum: escrito uma única vez e depende apenas de Frete
    public void contratar(double valorCarga) {
        Frete frete = criarFrete();
        double valor = frete.calcular(valorCarga);
        System.out.printf("Frete %s | Valor: R$ %.2f | Documentos: %s%n",
                frete.nome(), valor, frete.documentos());
    }
}
