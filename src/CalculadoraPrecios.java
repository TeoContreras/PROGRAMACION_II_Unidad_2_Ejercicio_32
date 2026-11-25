public class CalculadoraPrecios {
    private PoliticaDescuento politica;
    public CalculadoraPrecios(PoliticaDescuento politica) { this.politica = politica; }
    public void setPolitica(PoliticaDescuento politica) { this.politica = politica; }
    public void calcular(double monto) {
        double descuento = politica.calcularDescuento(monto);
        System.out.println("Original: $" + monto + " | Ahorro: $" + descuento + " | Final: $" + (monto - descuento));
    }
}
