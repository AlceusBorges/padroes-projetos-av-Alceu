public class FreteRodoviario implements Frete {
    public String nome() { return "Rodoviário"; }
    public double calcular(double valorCarga) { return valorCarga * 0.02; }
    public String documentos() { return "CT-e, MDF-e"; }
}
