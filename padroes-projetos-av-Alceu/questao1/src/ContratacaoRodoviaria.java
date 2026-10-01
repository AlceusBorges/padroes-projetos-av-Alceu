public class ContratacaoRodoviaria extends ContratacaoFrete {
    protected Frete criarFrete() { return new FreteRodoviario(); }
}
