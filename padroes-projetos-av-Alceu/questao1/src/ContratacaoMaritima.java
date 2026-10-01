public class ContratacaoMaritima extends ContratacaoFrete {
    protected Frete criarFrete() { return new FreteMaritimo(); }
}
