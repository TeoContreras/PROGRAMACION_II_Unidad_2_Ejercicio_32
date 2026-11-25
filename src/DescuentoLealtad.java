public class DescuentoLealtad implements PoliticaDescuento {
    public double calcularDescuento(double monto) { return monto > 0 ? monto * 0.10 : 0; }
}
