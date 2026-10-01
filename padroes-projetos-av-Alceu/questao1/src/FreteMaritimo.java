public class FreteMaritimo implements Frete {
    public String nome() { return "Marítimo"; }
    public double calcular(double valorCarga) { return valorCarga * 0.01; }
    public String documentos() { return "BL, fatura comercial"; }
}
