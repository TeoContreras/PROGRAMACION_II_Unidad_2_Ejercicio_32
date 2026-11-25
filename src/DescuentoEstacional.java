public class DescuentoEstacional implements PoliticaDescuento {
    public double calcularDescuento(double monto) { return monto > 0 ? monto * 0.15 : 0; }
}
