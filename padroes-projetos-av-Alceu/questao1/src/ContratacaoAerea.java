public class ContratacaoAerea extends ContratacaoFrete {
    protected Frete criarFrete() { return new FreteAereo(); }
}
