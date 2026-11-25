public class DescuentoVolumen implements PoliticaDescuento {
    public double calcularDescuento(double monto) { return monto >= 50000 ? monto * 0.20 : 0; }
}
