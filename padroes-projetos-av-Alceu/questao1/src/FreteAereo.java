public class FreteAereo implements Frete {
    public String nome() { return "Aéreo"; }
    public double calcular(double valorCarga) { return valorCarga * 0.06; }
    public String documentos() { return "AWB"; }
}
